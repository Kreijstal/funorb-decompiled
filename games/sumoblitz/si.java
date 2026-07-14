/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class si extends nn {
    private java.nio.ByteBuffer field_b;
    static int field_c;
    static hr field_e;
    static hr field_d;

    final static int c(int param0, int param1) {
        int var2 = 0;
        Object var3 = null;
        if (-1 != param0) {
          if (-1 < param0) {
            L0: {
              var2 = 1;
              if (65535 >= param0) {
                break L0;
              } else {
                var2 += 16;
                param0 = param0 >> 16;
                break L0;
              }
            }
            L1: {
              if (-256 <= (param0 ^ -1)) {
                break L1;
              } else {
                var2 += 8;
                param0 = param0 >> 8;
                break L1;
              }
            }
            L2: {
              if (param0 < -16) {
                var2 += 4;
                param0 = param0 >> 4;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-4 < param0) {
                var2 += 2;
                param0 = param0 >> 2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0 >= -2) {
                break L4;
              } else {
                var2++;
                param0 = param0 >> 1;
                break L4;
              }
            }
            return var2;
          } else {
            L5: {
              var2 = 2;
              if (65535 > param0) {
                param0 = param0 >> 16;
                var2 += 16;
                break L5;
              } else {
                break L5;
              }
            }
            if (param1 != 1) {
              L6: {
                var3 = null;
                byte[] discarded$1 = si.a((File) null, (byte) 38);
                if (param0 < -256) {
                  param0 = param0 >> 8;
                  var2 += 8;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (-16 <= param0) {
                  break L7;
                } else {
                  param0 = param0 >> 4;
                  var2 += 4;
                  break L7;
                }
              }
              L8: {
                if (-4 > param0) {
                  param0 = param0 >> 2;
                  var2 += 2;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (param0 < -2) {
                  var2++;
                  param0 = param0 >> 1;
                  break L9;
                } else {
                  break L9;
                }
              }
              return var2;
            } else {
              L10: {
                if (param0 < -256) {
                  param0 = param0 >> 8;
                  var2 += 8;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (-16 <= param0) {
                  break L11;
                } else {
                  param0 = param0 >> 4;
                  var2 += 4;
                  break L11;
                }
              }
              L12: {
                if (-4 > param0) {
                  param0 = param0 >> 2;
                  var2 += 2;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (param0 < -2) {
                  var2++;
                  param0 = param0 >> 1;
                  break L13;
                } else {
                  break L13;
                }
              }
              return var2;
            }
          }
        } else {
          return 0;
        }
    }

    final void a(byte[] param0, int param1) {
        int var3 = -124 % ((param1 - -47) / 62);
        ((si) this).field_b = java.nio.ByteBuffer.allocateDirect(param0.length);
        java.nio.Buffer discarded$0 = ((si) this).field_b.position(0);
        java.nio.ByteBuffer discarded$1 = ((si) this).field_b.put(param0);
    }

    final static byte[] a(File param0, byte param1) {
        int var2 = -1 % ((39 - param1) / 49);
        return kq.a((int)param0.length(), param0, (byte) 103);
    }

    si() {
    }

    final byte[] a(int param0, int param1, int param2) {
        byte[] var4 = null;
        Object var5 = null;
        byte[] var6 = null;
        if (param2 != 15747) {
          var5 = null;
          si.a((java.applet.Applet) null, (byte) 104);
          var6 = new byte[param1];
          var4 = var6;
          java.nio.Buffer discarded$8 = ((si) this).field_b.position(param0);
          java.nio.ByteBuffer discarded$9 = ((si) this).field_b.get(var6, 0, param1);
          return var6;
        } else {
          var6 = new byte[param1];
          var4 = var6;
          java.nio.Buffer discarded$10 = ((si) this).field_b.position(param0);
          java.nio.ByteBuffer discarded$11 = ((si) this).field_b.get(var6, 0, param1);
          return var6;
        }
    }

    public static void b(int param0) {
        int var1 = -2 / ((param0 - 65) / 43);
        field_d = null;
        field_e = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        kd.field_a[param5] = param4;
        if (param3 != 2) {
          return;
        } else {
          za.field_l[param5] = param2;
          nj.field_d[param5] = param6;
          pj.field_k[param5] = param0;
          rh.field_s[param5] = param1;
          return;
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        CharSequence var3 = null;
        var2 = param0.getParameter("username");
        if (var2 != null) {
          var3 = (CharSequence) (Object) var2;
          if (-1L == (vo.a(var3, 7441) ^ -1L)) {
            return;
          } else {
            L0: {
              if (param1 <= -42) {
                break L0;
              } else {
                field_c = -99;
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final byte[] a(boolean param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[((si) this).field_b.capacity()];
        var2 = var3;
        java.nio.Buffer discarded$21 = ((si) this).field_b.position(0);
        java.nio.ByteBuffer discarded$22 = ((si) this).field_b.get(var3);
        if (param0) {
          byte[] discarded$23 = ((si) this).a(false);
          return var3;
        } else {
          return var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
    }
}
