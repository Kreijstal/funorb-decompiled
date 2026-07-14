/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kf extends ce implements ra {
    static int field_M;
    static String field_N;
    static qc field_I;
    static String field_R;
    static ud field_P;
    static w field_Q;
    static int field_O;
    static int field_L;
    vj field_H;
    static ke field_G;
    static String field_J;
    static int field_K;

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return null != ((kf) this).e((byte) -74) ? true : false;
    }

    void a(ce param0, int param1, int param2, int param3) {
        rd var5 = null;
        ce var6 = null;
        int var7 = 0;
        ce var8 = null;
        L0: {
          var7 = client.field_A ? 1 : 0;
          if (param1 > 38) {
            break L0;
          } else {
            boolean discarded$2 = ((kf) this).a(false);
            break L0;
          }
        }
        super.a(param0, 68, param2, param3);
        var5 = new rd(((kf) this).field_H);
        var8 = (ce) (Object) var5.a((byte) 71);
        L1: while (true) {
          L2: {
            if (var8 == null) {
              break L2;
            } else {
              if (!var8.a((byte) 38)) {
                break L2;
              } else {
                var8.a(param0, 47, ((kf) this).field_D + param2, param3 - -((kf) this).field_u);
                var6 = (ce) (Object) var5.a(-62);
                continue L1;
              }
            }
          }
          return;
        }
    }

    final void b(ce param0, byte param1) {
        if (param1 != -55) {
            Object var4 = null;
            boolean discarded$0 = ((kf) this).a(false, (ce) null);
        }
        ((kf) this).field_H.a((bh) (Object) param0, 2777);
    }

    boolean a(int param0, int param1, ce param2, char param3) {
        int var6 = 0;
        ce var7_ref_ce = null;
        int var7 = 0;
        int var8 = 0;
        ce var9 = null;
        rd var10 = null;
        boolean stackIn_13_0 = false;
        boolean stackOut_12_0 = false;
        boolean stackOut_11_0 = false;
        var8 = client.field_A ? 1 : 0;
        var10 = new rd(((kf) this).field_H);
        var6 = 18 % ((-22 - param0) / 49);
        var9 = (ce) (Object) var10.a((byte) 71);
        L0: while (true) {
          L1: {
            if (var9 == null) {
              break L1;
            } else {
              if (!var9.a((byte) 124)) {
                break L1;
              } else {
                L2: {
                  if (!var9.a(true)) {
                    break L2;
                  } else {
                    if (var9.a(-79, param1, param2, param3)) {
                      return true;
                    } else {
                      break L2;
                    }
                  }
                }
                var7_ref_ce = (ce) (Object) var10.a(-78);
                continue L0;
              }
            }
          }
          var7 = param1;
          if (-81 == (var7 ^ -1)) {
            L3: {
              if (!bj.field_d[81]) {
                stackOut_12_0 = ((kf) this).a(32, param2);
                stackIn_13_0 = stackOut_12_0;
                break L3;
              } else {
                stackOut_11_0 = ((kf) this).a(param2, (byte) -120);
                stackIn_13_0 = stackOut_11_0;
                break L3;
              }
            }
            return stackIn_13_0;
          } else {
            return false;
          }
        }
    }

    final void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        rd var7 = null;
        ce var8 = null;
        int var9 = 0;
        ce var10 = null;
        var9 = client.field_A ? 1 : 0;
        var7 = new rd(((kf) this).field_H);
        var10 = (ce) (Object) var7.a((byte) 71);
        L0: while (true) {
          L1: {
            if (var10 == null) {
              break L1;
            } else {
              if (!var10.a((byte) 119)) {
                break L1;
              } else {
                var10.a(param0, param1 ^ 0, ((kf) this).field_u + param2, param3, ((kf) this).field_D + param4, param5);
                var8 = (ce) (Object) var7.a(-126);
                continue L0;
              }
            }
          }
          L2: {
            if (param1 == 64) {
              break L2;
            } else {
              field_J = null;
              break L2;
            }
          }
          return;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = client.field_A ? 1 : 0;
        if (param0 != null) {
          var2 = 0;
          var3 = param0.length();
          L0: while (true) {
            L1: {
              if (var3 <= var2) {
                break L1;
              } else {
                if (!ug.a(param0.charAt(var2), 32)) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var2 >= var3) {
                  break L3;
                } else {
                  if (!ug.a(param0.charAt(var3 + -1), 32)) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              var4 = -var2 + var3;
              if ((var4 ^ -1) <= -2) {
                if (12 >= var4) {
                  var5 = new StringBuilder(var4);
                  if (param1 == 2) {
                    var6 = var2;
                    L4: while (true) {
                      if (var3 <= var6) {
                        if (0 != var5.length()) {
                          return var5.toString();
                        } else {
                          return null;
                        }
                      } else {
                        var7 = param0.charAt(var6);
                        if (oe.a((char) var7, param1 ^ -6239)) {
                          var8 = un.a(228, (char) var7);
                          if (var8 != 0) {
                            StringBuilder discarded$1 = var5.append(var8);
                            var6++;
                            continue L4;
                          } else {
                            var6++;
                            continue L4;
                          }
                        } else {
                          var6++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final int d(int param0) {
        int var5 = 0;
        int var6 = client.field_A ? 1 : 0;
        int var2 = 0;
        rd var3 = new rd(((kf) this).field_H);
        ce var7 = (ce) (Object) var3.a((byte) 71);
        while (var7 != null) {
            var5 = var7.d(-31);
            if (!(var2 >= var5)) {
                var2 = var5;
            }
            ce var4 = (ce) (Object) var3.a(-61);
        }
        var5 = -18 / ((36 - param0) / 51);
        return var2;
    }

    String c(byte param0) {
        rd var2 = null;
        ce var3 = null;
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = client.field_A ? 1 : 0;
          var2 = new rd(((kf) this).field_H);
          var3 = (ce) (Object) var2.a((byte) 71);
          if (param0 == 113) {
            break L0;
          } else {
            var6 = null;
            boolean discarded$2 = ((kf) this).a(59, 12, 76, (ce) null, -65, -4, true);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.c((byte) 113);
            if (var4 == null) {
              var3 = (ce) (Object) var2.a(-47);
              continue L1;
            } else {
              return var4;
            }
          } else {
            return null;
          }
        }
    }

    private final void g(int param0) {
        int var4 = client.field_A ? 1 : 0;
        if (param0 != 0) {
            field_L = -109;
        }
        rd var2 = new rd(((kf) this).field_H);
        ce var5 = (ce) (Object) var2.a((byte) 71);
        while (var5 != null) {
            var5.f(121);
            ce var3 = (ce) (Object) var2.a(param0 + -57);
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != -16555) {
            Object var7 = null;
            boolean discarded$0 = ((kf) this).a((ce) null, (byte) 126);
        }
        super.b(param0, param1, param2, param3, param4 + 0);
        this.g(0);
    }

    final boolean a(ce param0, byte param1) {
        rd var5 = null;
        ce var8 = null;
        int var7 = client.field_A ? 1 : 0;
        if (((kf) this).field_H.b(-105)) {
            return false;
        }
        rd var3 = new rd(((kf) this).field_H);
        ce var4 = (ce) (Object) var3.a(true);
        while (var4 != null) {
            if (var4.a(true)) {
                var5 = new rd(((kf) this).field_H);
                bh discarded$0 = var5.a((bh) (Object) var4, (byte) -88);
                var8 = (ce) (Object) var5.d(2078965185);
                while (var8 != null) {
                    if (!(!var8.a(false, param0))) {
                        return true;
                    }
                    ce var6 = (ce) (Object) var5.d(2078965185);
                }
            }
            var4 = (ce) (Object) var3.d(2078965185);
        }
        if (param1 >= -16) {
            field_Q = null;
            return false;
        }
        return false;
    }

    final void d(byte param0) {
        int var4 = client.field_A ? 1 : 0;
        rd var2 = new rd(((kf) this).field_H);
        if (param0 != -95) {
            String discarded$0 = ((kf) this).c((byte) 50);
        }
        ce var5 = (ce) (Object) var2.a((byte) 71);
        while (var5 != null) {
            var5.d((byte) -95);
            ce var3 = (ce) (Object) var2.a(-98);
        }
    }

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        rd var8 = null;
        ce var9 = null;
        int var10 = 0;
        var10 = client.field_A ? 1 : 0;
        var8 = new rd(((kf) this).field_H);
        var9 = (ce) (Object) var8.a((byte) 71);
        if (param6 == -55) {
          L0: while (true) {
            L1: {
              if (var9 == null) {
                break L1;
              } else {
                if (!var9.a((byte) 120)) {
                  break L1;
                } else {
                  if (var9.a(param0, param1, param2, param3, ((kf) this).field_D + param4, ((kf) this).field_u + param5, (byte) -55)) {
                    return true;
                  } else {
                    var9 = (ce) (Object) var8.a(-113);
                    continue L0;
                  }
                }
              }
            }
            return false;
          }
        } else {
          return true;
        }
    }

    kf(int param0, int param1, int param2, int param3, gl param4) {
        super(param0, param1, param2, param3, param4, (kg) null);
        ((kf) this).field_H = new vj();
    }

    final boolean a(int param0, int param1, int param2, ce param3, int param4, int param5, boolean param6) {
        ce var9 = null;
        int var10 = 0;
        Object var11 = null;
        ce var12 = null;
        rd var13 = null;
        L0: {
          var10 = client.field_A ? 1 : 0;
          var13 = new rd(((kf) this).field_H);
          if (!param6) {
            break L0;
          } else {
            var11 = null;
            boolean discarded$2 = ((kf) this).a(true, (ce) null);
            break L0;
          }
        }
        var12 = (ce) (Object) var13.a((byte) 71);
        L1: while (true) {
          L2: {
            if (var12 == null) {
              break L2;
            } else {
              if (!var12.a((byte) 67)) {
                break L2;
              } else {
                L3: {
                  if (!var12.a(true)) {
                    break L3;
                  } else {
                    if (var12.a(param0, param1, param2, param3, param4, param5, param6)) {
                      return true;
                    } else {
                      break L3;
                    }
                  }
                }
                var9 = (ce) (Object) var13.a(-128);
                continue L1;
              }
            }
          }
          return false;
        }
    }

    private final void a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        int var7 = 0;
        int var8 = client.field_A ? 1 : 0;
        if (param1 != 0) {
            Object var9 = null;
            StringBuilder discarded$0 = ((kf) this).a((Hashtable) null, -83, (StringBuilder) null, true);
        }
        rd var10 = new rd(((kf) this).field_H);
        ce var6 = (ce) (Object) var10.a((byte) 71);
        while (var6 != null) {
            StringBuilder discarded$1 = param2.append(10);
            for (var7 = 0; var7 <= param0; var7++) {
                StringBuilder discarded$2 = param2.append(32);
            }
            StringBuilder discarded$3 = var6.a(param3, 1 + param0, param2, true);
            var6 = (ce) (Object) var10.a(-113);
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = client.field_A ? 1 : 0;
        if (param2 == 0) {
            if (((kf) this).field_p != null) {
                ((kf) this).field_p.a(true, param0, param3, (byte) -108, (ce) this);
            }
        }
        rd var5 = new rd(((kf) this).field_H);
        ce var8 = (ce) (Object) var5.a(true);
        while (var8 != null) {
            var8.a(param0 + ((kf) this).field_u, -124, param2, param3 - -((kf) this).field_D);
            ce var6 = (ce) (Object) var5.d(2078965185);
        }
        if (param1 > -103) {
            ((kf) this).a(59, -115, 20, 76);
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        if (((kf) this).a(0, param1, param0, param2)) {
            ((kf) this).a((byte) 72, param2, param0, param1);
            this.a(param1, 0, param2, param0);
        }
        if (!param3) {
            field_P = null;
        }
        return param2;
    }

    final boolean a(int param0, ce param1) {
        rd var5 = null;
        ce var8 = null;
        int var7 = client.field_A ? 1 : 0;
        if (!(!((kf) this).field_H.b(-15))) {
            return false;
        }
        rd var9 = new rd(((kf) this).field_H);
        ce var4 = (ce) (Object) var9.a((byte) 71);
        while (var4 != null) {
            if (var4.a(true)) {
                var5 = new rd(((kf) this).field_H);
                bh discarded$0 = var5.a((bh) (Object) var4, false);
                var8 = (ce) (Object) var5.a(param0 ^ -24);
                while (var8 != null) {
                    if (!(!var8.a(false, param1))) {
                        return true;
                    }
                    ce var6 = (ce) (Object) var5.a(param0 + -119);
                }
            }
            var4 = (ce) (Object) var9.a(-109);
        }
        if (param0 != 32) {
            kf.h(-42);
        }
        return false;
    }

    public static void h(int param0) {
        if (param0 < 72) {
            kf.h(-51);
        }
        field_P = null;
        field_R = null;
        field_Q = null;
        field_I = null;
        field_J = null;
        field_N = null;
        field_G = null;
    }

    ce e(byte param0) {
        int var4 = client.field_A ? 1 : 0;
        rd var2 = new rd(((kf) this).field_H);
        ce var5 = (ce) (Object) var2.a((byte) 71);
        while (var5 != null) {
            if (!(!var5.a(true))) {
                return var5;
            }
            ce var3 = (ce) (Object) var2.a(-92);
        }
        if (param0 == -74) {
            return null;
        }
        field_P = null;
        return null;
    }

    final boolean a(boolean param0, ce param1) {
        int var5 = client.field_A ? 1 : 0;
        if (param0) {
            field_O = -99;
        }
        rd var3 = new rd(((kf) this).field_H);
        ce var6 = (ce) (Object) var3.a((byte) 71);
        while (var6 != null) {
            if (var6.a(false, param1)) {
                return true;
            }
            ce var4 = (ce) (Object) var3.a(-69);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "Offer draw";
        field_N = "Unable to connect to the data server. Please check any firewall you are using.";
        field_L = -1;
        field_J = "This is your RuneScape clan if you have one.";
    }
}
