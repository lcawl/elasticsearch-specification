
package org.elasticsearch.x_pack.watcher.stop_watcher;

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


public class StopWatcherResponse  implements XContentable<StopWatcherResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    return builder;
  }

  @Override
  public StopWatcherResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return StopWatcherResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<StopWatcherResponse, Void> PARSER =
    new ConstructingObjectParser<>(StopWatcherResponse.class.getName(), false, args -> new StopWatcherResponse());

  static {
    
  }

}
