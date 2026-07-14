/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sb extends pc {
    private int field_D;
    private n field_H;
    static sj field_E;
    static String field_C;
    static dl[] field_B;
    static volatile int field_I;
    static int field_F;

    final String a(byte param0) {
        if (!(!((sb) this).field_m)) {
            return ((sb) this).field_H.a(-16774);
        }
        if (param0 < -23) {
            return null;
        }
        sb.e((byte) -41);
        return null;
    }

    final static String a(int param0, DataInputStream param1) throws IOException {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        var2 = param1.readInt();
        var3 = var2 >>> 1300721528;
        var2 = var2 & 16777215;
        if (var3 <= 1) {
          var4 = new byte[var2];
          param1.readFully(var4);
          if (param0 > var3) {
            return fa.a((byte) -80, var4);
          } else {
            return db.a((byte) 109, var4);
          }
        } else {
          throw new RuntimeException("Unsupported string version number: " + var3);
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        ((sb) this).field_D = ((sb) this).field_D + 1;
        int var5 = -82 % ((param1 - -50) / 59);
        super.a(param0, -121, param2, param3);
    }

    final boolean a(boolean param0, qm param1) {
        if (!param0) {
            field_B = null;
            return false;
        }
        return false;
    }

    final static void a(db param0, int param1) {
        Object var3 = null;
        if (param1 != 18180) {
          var3 = null;
          sb.a((db) null, 6);
          hb.field_k = bl.a(param0, "initialset", "level-lost").a();
          return;
        } else {
          hb.field_k = bl.a(param0, "initialset", "level-lost").a();
          return;
        }
    }

    public static void e(byte param0) {
        if (param0 != 2) {
          field_C = null;
          field_B = null;
          field_C = null;
          field_E = null;
          return;
        } else {
          field_B = null;
          field_C = null;
          field_E = null;
          return;
        }
    }

    sb(n param0) {
        ((sb) this).field_H = param0;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        oi var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dl var14 = null;
        dl var15 = null;
        dl var16 = null;
        dl var17 = null;
        dl var18 = null;
        dl var20 = null;
        dl var21 = null;
        dl var22 = null;
        var11 = CrazyCrystals.field_B;
        super.a(param0, (byte) -110, param2, param3);
        if (param3 == 0) {
          var5 = (((sb) this).field_g >> -1803143359) + (((sb) this).field_r + param2);
          var6 = (((sb) this).field_f >> 303870721) + (param0 - -((sb) this).field_j);
          if (param1 < -12) {
            L0: {
              var8 = ((sb) this).field_H.c((byte) 45);
              if (var8 == ta.field_h) {
                break L0;
              } else {
                if (var8 == ec.field_h) {
                  break L0;
                } else {
                  if (var8 != rk.field_c) {
                    if (ih.field_b == var8) {
                      var21 = ao.field_b[1];
                      var21.d(-(var21.field_l >> -1795681439) + var5, -(var21.field_u >> -365913151) + var6, 256);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var20 = ao.field_b[2];
                    var20.d(-(var20.field_l >> 1101632257) + var5, -(var20.field_u >> 1584439841) + var6, 256);
                    return;
                  }
                }
              }
            }
            var22 = ao.field_b[0];
            var9 = var22.field_n << -962765663;
            var10 = var22.field_o << 1343334881;
            if (null != tk.field_l) {
              if (var9 <= tk.field_l.field_l) {
                if (tk.field_l.field_u < var10) {
                  tk.field_l = new dl(var9, var10);
                  em.a((byte) 38, tk.field_l);
                  var22.a(112, 144, var22.field_n << -462064796, var22.field_o << 758283460, -((sb) this).field_D << 43241674, 4096);
                  lg.a(1);
                  tk.field_l.d(-var22.field_n + var5, -var22.field_o + var6, 256);
                  return;
                } else {
                  em.a((byte) 38, tk.field_l);
                  kh.a();
                  var22.a(112, 144, var22.field_n << -462064796, var22.field_o << 758283460, -((sb) this).field_D << 43241674, 4096);
                  lg.a(1);
                  tk.field_l.d(-var22.field_n + var5, -var22.field_o + var6, 256);
                  return;
                }
              } else {
                tk.field_l = new dl(var9, var10);
                em.a((byte) 38, tk.field_l);
                var22.a(112, 144, var22.field_n << -462064796, var22.field_o << 758283460, -((sb) this).field_D << 43241674, 4096);
                lg.a(1);
                tk.field_l.d(-var22.field_n + var5, -var22.field_o + var6, 256);
                return;
              }
            } else {
              tk.field_l = new dl(var9, var10);
              em.a((byte) 38, tk.field_l);
              var22.a(112, 144, var22.field_n << -462064796, var22.field_o << 758283460, -((sb) this).field_D << 43241674, 4096);
              lg.a(1);
              tk.field_l.d(-var22.field_n + var5, -var22.field_o + var6, 256);
              return;
            }
          } else {
            field_C = null;
            var8 = ((sb) this).field_H.c((byte) 45);
            if (var8 != ta.field_h) {
              if (var8 != ec.field_h) {
                if (var8 != rk.field_c) {
                  if (ih.field_b == var8) {
                    var18 = ao.field_b[1];
                    var18.d(-(var18.field_l >> -1795681439) + var5, -(var18.field_u >> -365913151) + var6, 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var17 = ao.field_b[2];
                  var17.d(-(var17.field_l >> 1101632257) + var5, -(var17.field_u >> 1584439841) + var6, 256);
                  return;
                }
              } else {
                L1: {
                  L2: {
                    var16 = ao.field_b[0];
                    var14 = var16;
                    var9 = var16.field_n << -962765663;
                    var10 = var16.field_o << 1343334881;
                    if (null == tk.field_l) {
                      break L2;
                    } else {
                      if (var9 > tk.field_l.field_l) {
                        break L2;
                      } else {
                        if (tk.field_l.field_u >= var10) {
                          em.a((byte) 38, tk.field_l);
                          kh.a();
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  tk.field_l = new dl(var9, var10);
                  em.a((byte) 38, tk.field_l);
                  break L1;
                }
                var16.a(112, 144, var16.field_n << -462064796, var16.field_o << 758283460, -((sb) this).field_D << 43241674, 4096);
                lg.a(1);
                tk.field_l.d(-var16.field_n + var5, -var16.field_o + var6, 256);
                return;
              }
            } else {
              L3: {
                L4: {
                  var15 = ao.field_b[0];
                  var9 = var15.field_n << -962765663;
                  var10 = var15.field_o << 1343334881;
                  if (null == tk.field_l) {
                    break L4;
                  } else {
                    if (var9 > tk.field_l.field_l) {
                      break L4;
                    } else {
                      if (tk.field_l.field_u >= var10) {
                        em.a((byte) 38, tk.field_l);
                        kh.a();
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                tk.field_l = new dl(var9, var10);
                em.a((byte) 38, tk.field_l);
                break L3;
              }
              var15.a(112, 144, var15.field_n << -462064796, var15.field_o << 758283460, -((sb) this).field_D << 43241674, 4096);
              lg.a(1);
              tk.field_l.d(-var15.field_n + var5, -var15.field_o + var6, 256);
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new sj(8, 0, 4, 1);
        field_C = "To Customer Support";
        field_I = 0;
    }
}
