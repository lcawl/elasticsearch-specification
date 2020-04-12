
package org.elasticsearch.ingest.simulate_pipeline;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.ingest.simulate_pipeline.*;

public class SimulatePipelineResponse  implements XContentable<SimulatePipelineResponse> {
  
  static final ParseField DOCS = new ParseField("docs");
  private List<PipelineSimulation> _docs;
  public List<PipelineSimulation> getDocs() { return this._docs; }
  public SimulatePipelineResponse setDocs(List<PipelineSimulation> val) { this._docs = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    if (_docs != null) {
      builder.array(DOCS.getPreferredName(), _docs);
    }
    return builder;
  }

  @Override
  public SimulatePipelineResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SimulatePipelineResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SimulatePipelineResponse, Void> PARSER =
    new ConstructingObjectParser<>(SimulatePipelineResponse.class.getName(), false, args -> new SimulatePipelineResponse());

  static {
    PARSER.declareObjectArray(SimulatePipelineResponse::setDocs, (p, t) -> PipelineSimulation.PARSER.apply(p, t), DOCS);
  }

}
