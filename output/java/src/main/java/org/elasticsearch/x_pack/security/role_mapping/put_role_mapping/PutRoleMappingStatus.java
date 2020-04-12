
package org.elasticsearch.x_pack.security.role_mapping.put_role_mapping;

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


public class PutRoleMappingStatus  implements XContentable<PutRoleMappingStatus> {
  
  static final ParseField CREATED = new ParseField("created");
  private Boolean _created;
  public Boolean getCreated() { return this._created; }
  public PutRoleMappingStatus setCreated(Boolean val) { this._created = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(CREATED.getPreferredName(), _created);
    return builder;
  }

  @Override
  public PutRoleMappingStatus fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutRoleMappingStatus.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutRoleMappingStatus, Void> PARSER =
    new ConstructingObjectParser<>(PutRoleMappingStatus.class.getName(), false, args -> new PutRoleMappingStatus());

  static {
    PARSER.declareBoolean(PutRoleMappingStatus::setCreated, CREATED);
  }

}
