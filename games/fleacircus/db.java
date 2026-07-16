/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class db extends gj {
    boolean field_G;
    static int field_H;
    static dd field_I;
    static String field_F;
    static la field_J;
    private f field_L;
    private int field_K;

    final void a(int param0, byte param1, int param2) {
        ((db) this).a(-param2 + ll.field_m >> -1911694975, param2, -param0 + ca.field_Q >> -425982111, param0, 80);
        if (param1 > -126) {
            field_J = null;
        }
    }

    boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var2 = -3 / ((param0 - 38) / 49);
          var3 = this.e((byte) -48);
          var4 = -((db) this).field_K + var3;
          if (var4 <= 0) {
            break L0;
          } else {
            ((db) this).field_K = ((db) this).field_K + (var4 - -8 - 1) / 8;
            break L0;
          }
        }
        L1: {
          if (-1 >= (var4 ^ -1)) {
            break L1;
          } else {
            ((db) this).field_K = ((db) this).field_K + (-15 + var4) / 16;
            break L1;
          }
        }
        L2: {
          L3: {
            if (-1 != (((db) this).field_K ^ -1)) {
              break L3;
            } else {
              if ((var3 ^ -1) != -1) {
                break L3;
              } else {
                if (((db) this).field_G) {
                  break L3;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
            }
          }
          stackOut_8_0 = 0;
          stackIn_9_0 = stackOut_8_0;
          break L2;
        }
        return stackIn_9_0 != 0;
    }

    db(f param0, int param1, int param2) {
        super(-param1 + ll.field_m >> 1303335553, -param2 + ca.field_Q >> -28928223, param1, param2, (ch) null);
        ((db) this).field_L = param0;
        ((db) this).field_G = false;
        ((db) this).field_K = 0;
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        if (-1 == ((db) this).field_K) {
          return;
        } else {
          if (-257 <= ((db) this).field_K) {
            if (param3 == 0) {
              ((db) this).b(param0 + ((db) this).field_z, param1 + ((db) this).field_y, 17344);
              super.b(param0, param1, true, param3);
              return;
            } else {
              return;
            }
          } else {
            L0: {
              L1: {
                if (null == ok.field_y) {
                  break L1;
                } else {
                  if (((db) this).field_u > ok.field_y.field_w) {
                    break L1;
                  } else {
                    if (ok.field_y.field_t >= ((db) this).field_j) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              ok.field_y = new dd(((db) this).field_u, ((db) this).field_j);
              break L0;
            }
            r.a(ok.field_y, 45);
            gb.c();
            ((db) this).b(0, 0, 17344);
            super.b(-param0 + -((db) this).field_z, -param1 - ((db) this).field_y, param2, param3);
            ia.a(-62);
            ok.field_y.c(((db) this).field_y + param1, ((db) this).field_z + param0, ((db) this).field_K);
            return;
          }
        }
    }

    boolean j(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          ((db) this).field_K = this.e((byte) -122);
          if (param0 > 70) {
            break L0;
          } else {
            ((db) this).field_L = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-1 != (((db) this).field_K ^ -1)) {
              break L2;
            } else {
              if (((db) this).field_G) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    abstract void b(int param0, int param1, int param2);

    private final int e(byte param0) {
        if (param0 >= -41) {
            return -17;
        }
        return !((db) this).field_G ? 0 : (Object) (Object) ((db) this).field_L.l(-87) == this ? 256 : 0;
    }

    final static String a(String param0, String[] param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = fleas.field_A ? 1 : 0;
        var3 = param0.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param0.indexOf("<%", var5);
          if ((var6_int ^ -1) <= -1) {
            var5 = 2 + var6_int;
            L1: while (true) {
              L2: {
                if (var3 <= var5) {
                  break L2;
                } else {
                  if (!em.a((byte) -108, param0.charAt(var5))) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              var7_ref_String = param0.substring(var6_int - -2, var5);
              if (!ii.a(12969, (CharSequence) (Object) var7_ref_String)) {
                continue L0;
              } else {
                if (var5 >= var3) {
                  continue L0;
                } else {
                  if (62 != param0.charAt(var5)) {
                    continue L0;
                  } else {
                    var5++;
                    var8 = pl.a((CharSequence) (Object) var7_ref_String, -9816);
                    var4 = var4 + (param1[var8].length() + (var6_int + -var5));
                    continue L0;
                  }
                }
              }
            }
          } else {
            var6 = new StringBuilder(var4);
            var7 = 0;
            var5 = 0;
            L3: while (true) {
              var8 = param0.indexOf("<%", var5);
              if ((var8 ^ -1) > -1) {
                L4: {
                  if (param2) {
                    break L4;
                  } else {
                    field_J = null;
                    break L4;
                  }
                }
                StringBuilder discarded$3 = var6.append(param0.substring(var7));
                return var6.toString();
              } else {
                var5 = var8 - -2;
                L5: while (true) {
                  L6: {
                    if (var5 >= var3) {
                      break L6;
                    } else {
                      if (!em.a((byte) -71, param0.charAt(var5))) {
                        break L6;
                      } else {
                        var5++;
                        continue L5;
                      }
                    }
                  }
                  var9 = param0.substring(var8 - -2, var5);
                  if (ii.a(12969, (CharSequence) (Object) var9)) {
                    if (var5 >= var3) {
                      continue L3;
                    } else {
                      if (62 == param0.charAt(var5)) {
                        var5++;
                        var10 = pl.a((CharSequence) (Object) var9, -9816);
                        StringBuilder discarded$4 = var6.append(param0.substring(var7, var8));
                        var7 = var5;
                        StringBuilder discarded$5 = var6.append(param1[var10]);
                        continue L3;
                      } else {
                        continue L3;
                      }
                    }
                  } else {
                    continue L3;
                  }
                }
              }
            }
          }
        }
    }

    final qa i(int param0) {
        if (param0 != -257) {
            Object var3 = null;
            String discarded$0 = db.a((String) null, (String[]) null, false);
        }
        qa var2 = super.i(param0 + 0);
        if (var2 != null) {
            return var2;
        }
        return (qa) this;
    }

    final static int a(byte param0, Random param1, int param2) {
        int var4 = 0;
        int var5 = fleas.field_A ? 1 : 0;
        if ((param2 ^ -1) >= -1) {
            throw new IllegalArgumentException();
        }
        if (!(!mc.a(param2, (byte) -124))) {
            return (int)(((long)param1.nextInt() & 4294967295L) * (long)param2 >> 829956704);
        }
        int var3 = -2147483648 + -(int)(4294967296L % (long)param2);
        if (param0 != -115) {
            field_F = null;
        }
        do {
            var4 = param1.nextInt();
        } while (var4 >= var3);
        return gk.a(param2, true, var4);
    }

    public static void k(int param0) {
        field_F = null;
        field_J = null;
        if (param0 != 0) {
            field_I = null;
        }
        field_I = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = 0;
        field_F = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
