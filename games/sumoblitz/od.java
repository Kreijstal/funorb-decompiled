/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class od implements nr {
    int field_b;
    int field_a;

    final static void a(int param0, byte param1) {
        int var2;
        int var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        if (param1 <= 8) {
          od.a(71);
          var3 = param0;
          if ((var3 ^ -1) != -2) {
            if (var3 != 2) {
              if (var3 != 3) {
                if (var3 != 0) {
                  if (4 != var3) {
                    if ((var3 ^ -1) != -7) {
                      if ((var3 ^ -1) != -6) {
                        return;
                      } else {
                        var2 = fi.a(8, he.field_o, (byte) -96);
                        fe.a(78, nt.field_n[0][var2]);
                        return;
                      }
                    } else {
                      var2 = fi.a(8, he.field_o, (byte) -96);
                      fe.a(78, nt.field_n[0][var2]);
                      return;
                    }
                  } else {
                    var2 = fi.a(5, he.field_o, (byte) -96);
                    fe.a(80, nt.field_n[2][var2]);
                    return;
                  }
                } else {
                  var2 = fi.a(8, he.field_o, (byte) -96);
                  fe.a(91, nt.field_n[1][var2]);
                  return;
                }
              } else {
                var2 = fi.a(8, he.field_o, (byte) -96);
                fe.a(91, nt.field_n[1][var2]);
                return;
              }
            } else {
              var2 = fi.a(8, he.field_o, (byte) -96);
              fe.a(91, nt.field_n[1][var2]);
              return;
            }
          } else {
            var2 = fi.a(8, he.field_o, (byte) -96);
            fe.a(91, nt.field_n[1][var2]);
            return;
          }
        } else {
          var3 = param0;
          if ((var3 ^ -1) != -2) {
            if (var3 != 2) {
              if (var3 != 3) {
                if (var3 != 0) {
                  if (4 != var3) {
                    if ((var3 ^ -1) != -7) {
                      if ((var3 ^ -1) != -6) {
                        return;
                      } else {
                        var2 = fi.a(8, he.field_o, (byte) -96);
                        fe.a(78, nt.field_n[0][var2]);
                        return;
                      }
                    } else {
                      var2 = fi.a(8, he.field_o, (byte) -96);
                      fe.a(78, nt.field_n[0][var2]);
                      return;
                    }
                  } else {
                    var2 = fi.a(5, he.field_o, (byte) -96);
                    fe.a(80, nt.field_n[2][var2]);
                    return;
                  }
                } else {
                  var2 = fi.a(8, he.field_o, (byte) -96);
                  fe.a(91, nt.field_n[1][var2]);
                  return;
                }
              } else {
                var2 = fi.a(8, he.field_o, (byte) -96);
                fe.a(91, nt.field_n[1][var2]);
                return;
              }
            } else {
              var2 = fi.a(8, he.field_o, (byte) -96);
              fe.a(91, nt.field_n[1][var2]);
              return;
            }
          } else {
            var2 = fi.a(8, he.field_o, (byte) -96);
            fe.a(91, nt.field_n[1][var2]);
            return;
          }
        }
    }

    final static void a(int param0) {
        rf.field_a.a((byte) 117);
        if (param0 != 5178) {
          return;
        } else {
          L0: {
            if (he.field_n == null) {
              he.field_n = new m(rf.field_a, t.field_s);
              break L0;
            } else {
              break L0;
            }
          }
          rf.field_a.a((byte) 115, he.field_n);
          return;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (param0 >= -50) {
            return;
        }
        try {
            if (11 == jv.field_a) {
                tu.a((byte) -126);
            }
            hu.a(hn.field_k, ur.field_R, ch.field_h, 122);
            um.a(0, 0, param1, (byte) 124);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "od.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    od(int param0, int param1) {
        this.field_b = param0;
        this.field_a = param1;
    }

    static {
    }
}
