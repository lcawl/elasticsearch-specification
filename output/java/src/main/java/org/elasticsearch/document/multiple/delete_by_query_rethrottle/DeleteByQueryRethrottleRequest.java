
package org.elasticsearch.document.multiple.delete_by_query_rethrottle;

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
import org.elasticsearch.internal.*;

public class DeleteByQueryRethrottleRequest  implements XContentable<DeleteByQueryRethrottleRequest> {
  
  static final ParseField REQUESTS_PER_SECOND = new ParseField("requests_per_second");
  private Long _requestsPerSecond;
  public Long getRequestsPerSecond() { return this._requestsPerSecond; }
  public DeleteByQueryRethrottleRequest setRequestsPerSecond(Long val) { this._requestsPerSecond = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(REQUESTS_PER_SECOND.getPreferredName(), _requestsPerSecond);
    return builder;
  }

  @Override
  public DeleteByQueryRethrottleRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteByQueryRethrottleRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteByQueryRethrottleRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeleteByQueryRethrottleRequest.class.getName(), false, args -> new DeleteByQueryRethrottleRequest());

  static {
    PARSER.declareLong(DeleteByQueryRethrottleRequest::setRequestsPerSecond, REQUESTS_PER_SECOND);
  }

}
