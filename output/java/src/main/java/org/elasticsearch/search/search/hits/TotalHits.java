
package org.elasticsearch.search.search.hits;

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
import org.elasticsearch.search.search.hits.*;
import org.elasticsearch.internal.*;

public class TotalHits  implements XContentable<TotalHits> {
  
  static final ParseField RELATION = new ParseField("relation");
  private TotalHitsRelation _relation;
  public TotalHitsRelation getRelation() { return this._relation; }
  public TotalHits setRelation(TotalHitsRelation val) { this._relation = val; return this; }


  static final ParseField VALUE = new ParseField("value");
  private Long _value;
  public Long getValue() { return this._value; }
  public TotalHits setValue(Long val) { this._value = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    if (_relation != null) {
      builder.field(RELATION.getPreferredName());
      _relation.toXContent(builder, params);
    }
    builder.field(VALUE.getPreferredName(), _value);
    return builder;
  }

  @Override
  public TotalHits fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TotalHits.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TotalHits, Void> PARSER =
    new ConstructingObjectParser<>(TotalHits.class.getName(), false, args -> new TotalHits());

  static {
    PARSER.declareObject(TotalHits::setRelation, (p, t) -> TotalHitsRelation.PARSER.apply(p), RELATION);
    PARSER.declareLong(TotalHits::setValue, VALUE);
  }

}
