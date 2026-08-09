/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    static String field_a;
    static int field_e;
    static ll[] field_d;
    static String field_b;
    static sn field_c;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 98) {
            return;
        }
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static void a(boolean param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ul.field_h = false;
              u.field_k = false;
              if (null == vf.field_k) {
                break L1;
              } else {
                if (!vf.field_k.field_G) {
                  break L1;
                } else {
                  L2: {
                    var3_int = 1;
                    if (param1 == 8) {
                      L3: {
                        if (hk.field_s) {
                          param2 = nj.field_f;
                          break L3;
                        } else {
                          param2 = ul.field_v;
                          break L3;
                        }
                      }
                      param1 = 2;
                      wh.field_f.a(26152, ge.field_g);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    if (10 == param1) {
                      var3_int = 0;
                      ma.h(-90);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var3_int == 0) {
                      break L5;
                    } else {
                      L6: {
                        if (ul.field_h) {
                          param2 = tj.a(114, new String[]{param2}, wa.field_Eb);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (!di.field_h) {
                          break L7;
                        } else {
                          param2 = si.field_n;
                          break L7;
                        }
                      }
                      vf.field_k.a(true, param2, param1);
                      break L5;
                    }
                  }
                  if ((param1 ^ -1) == -257) {
                    break L1;
                  } else {
                    if (-11 != (param1 ^ -1)) {
                      if (hk.field_s) {
                        break L1;
                      } else {
                        wh.field_f.f(true);
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            if (param0) {
              break L0;
            } else {
              field_b = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3);

            stackIn_28_1 = new StringBuilder().append("oa.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L8;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
    }

    static {
        field_a = "Chat view has been scrolled up. Scroll down to chat.";
        field_e = 50;
        field_b = "Minimap";
    }
}
