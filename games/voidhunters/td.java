/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class td extends rqa {
    final static String a(int param0, int param1) {
        if (-1 != (param0 ^ -1)) {
          if ((param0 ^ -1) != -2) {
            if (param1 > 88) {
              if (param0 != 2) {
                if ((param0 ^ -1) != -4) {
                  if (param0 != 4) {
                    if (param0 != 5) {
                      if (6 == param0) {
                        return null;
                      } else {
                        return "Unknown component type";
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return bpb.field_o;
                  }
                } else {
                  return whb.field_d;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return eia.field_r;
          }
        } else {
          return uf.field_F;
        }
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          td.a((byte) -64, (String) null, (File) null);
          return new nc((Object) (Object) frb.a(224, 118));
        } else {
          return new nc((Object) (Object) frb.a(224, 118));
        }
    }

    td(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(byte param0, String param1, File param2) {
        Object discarded$0 = jma.field_q.put((Object) (Object) param1, (Object) (Object) param2);
        int var3 = 97 / ((63 - param0) / 59);
    }

    static {
    }
}
