/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class od extends ak {
    private ak field_Kb;
    static String field_Nb;
    static int field_Gb;
    static String field_Hb;
    int field_Jb;
    private ak[] field_Mb;
    private ak[] field_Lb;
    static String field_Fb;
    static String field_Eb;
    static String field_Ib;

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          if (param0 >= 103) {
            break L0;
          } else {
            ((od) this).b((byte) 55);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (((od) this).field_Lb.length <= var4) {
            ((od) this).field_Kb.a(param1, ((od) this).field_nb + -param1, 0, 256, ((od) this).field_K);
            var8 = 0;
            var4 = var8;
            L2: while (true) {
              if (var8 >= ((od) this).field_Mb.length) {
                return;
              } else {
                ((od) this).field_Mb[var8].a(param2, -(2 * param2) + ((od) this).field_Kb.field_nb, param2, 256, -(param2 * 2) + ((od) this).field_Kb.field_K);
                if (((od) this).field_Jb != var8) {
                  ((od) this).field_Mb[var8].field_D = ((od) this).field_Mb[var8].field_D + 10000;
                  var8++;
                  continue L2;
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            var5 = ((od) this).field_K * var4 / ((od) this).field_Lb.length;
            var6 = ((od) this).field_K * (var4 + 1) / ((od) this).field_Lb.length;
            ((od) this).field_Lb[var4].field_D = var5;
            ((od) this).field_Lb[var4].field_S = 0;
            ((od) this).field_Lb[var4].field_K = var6 - var5;
            ((od) this).field_Lb[var4].field_nb = param1;
            var4++;
            continue L1;
          }
        }
    }

    final static void a(int param0, we param1, int param2, cb param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            int var16 = 0;
            aj var17 = null;
            byte[][] var18 = null;
            String var19 = null;
            byte[][] var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            Throwable decompiledCaughtException = null;
            var14 = Pixelate.field_H ? 1 : 0;
            var17 = new aj();
            var17.field_s = param1.f(255);
            var17.field_p = param1.k(param0 ^ param0);
            var17.field_r = new int[var17.field_s];
            var17.field_q = new int[var17.field_s];
            var17.field_l = new ei[var17.field_s];
            var17.field_v = new ei[var17.field_s];
            var17.field_w = new byte[var17.field_s][][];
            var17.field_u = new int[var17.field_s];
            var5 = 0;
            L0: while (true) {
              if (var5 >= var17.field_s) {
                var6_ref4 = decompiledCaughtException;
                var17.field_u[var5] = -5;
                var5++;
              } else {
                try {
                  L1: {
                    L2: {
                      var6_int = param1.f(255);
                      if (var6_int == 0) {
                        break L2;
                      } else {
                        if (1 == var6_int) {
                          break L2;
                        } else {
                          if ((var6_int ^ -1) != -3) {
                            L3: {
                              if (var6_int == -4) {
                                break L3;
                              } else {
                                if (-5 == var6_int) {
                                  break L3;
                                } else {
                                  var5++;
                                  break L1;
                                }
                              }
                            }
                            var19 = param1.h(param0 + 10);
                            var8 = param1.h(5);
                            var9 = param1.f(255);
                            var10 = new String[var9];
                            var11_int = 0;
                            L4: while (true) {
                              if (var11_int >= var9) {
                                L5: {
                                  var22 = new byte[var9][];
                                  var21 = var22;
                                  var20 = var21;
                                  var18 = var20;
                                  var11 = var18;
                                  if (3 == var6_int) {
                                    var12_int = 0;
                                    L6: while (true) {
                                      if (var9 <= var12_int) {
                                        break L5;
                                      } else {
                                        var13 = param1.k(param0 + 5);
                                        var11[var12_int] = new byte[var13];
                                        param1.a(var22[var12_int], 0, -76, var13);
                                        var12_int++;
                                        continue L6;
                                      }
                                    }
                                  } else {
                                    break L5;
                                  }
                                }
                                var17.field_r[var5] = var6_int;
                                var12 = new Class[var9];
                                var16 = 0;
                                var13 = var16;
                                L7: while (true) {
                                  if (var16 >= var9) {
                                    var17.field_v[var5] = param3.a(0, var12, var8, i.a(var19, -115));
                                    var17.field_w[var5] = var22;
                                    break L1;
                                  } else {
                                    var12[var16] = i.a(var10[var16], -113);
                                    var16++;
                                    continue L7;
                                  }
                                }
                              } else {
                                var10[var11_int] = param1.h(5);
                                var11_int++;
                                continue L4;
                              }
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    L8: {
                      var15 = param1.h(param0 ^ -2);
                      var7 = var15;
                      var8 = param1.h(param0 + 10);
                      var9 = 0;
                      if (var6_int != 1) {
                        break L8;
                      } else {
                        var9 = param1.k(param0 + 5);
                        break L8;
                      }
                    }
                    var17.field_r[var5] = var6_int;
                    var17.field_q[var5] = var9;
                    var17.field_l[var5] = param3.a(var8, i.a(var15, bn.a(param0, 121)), (byte) -94);
                    var5++;
                    break L1;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var5++;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                  var17.field_u[var5] = -3;
                  var5++;
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref3 = (Exception) (Object) decompiledCaughtException;
                  var17.field_u[var5] = -4;
                  var5++;
                }
                continue L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((od) this).field_S = param1;
        ((od) this).field_K = param3;
        ((od) this).field_nb = param4;
        ((od) this).field_D = param6;
        if (param0 != -19360) {
            field_Hb = null;
        }
        this.a(116, param5, param2);
    }

    od(long param0, ak param1, String[] param2, ak param3, ak[] param4, int param5) {
        super(param0, (ak) null);
        int var8 = 0;
        ak var9 = null;
        ((od) this).field_Lb = new ak[param2.length];
        ((od) this).field_Kb = new ak(0L, param3);
        ((od) this).field_Mb = param4;
        for (var8 = 0; var8 < param2.length; var8++) {
            var9 = new ak(0L, param1);
            var9.field_cb = param2[var8];
            ((od) this).field_Lb[var8] = var9;
            ((od) this).a(var9, (byte) 26);
        }
        ((od) this).a(((od) this).field_Kb, (byte) 26);
        int var11 = 0;
        var8 = var11;
        while (param4.length > var11) {
            ((od) this).field_Kb.a(param4[var11], (byte) 26);
            var11++;
        }
        ((od) this).field_Jb = param5;
        ((od) this).field_Lb[param5].field_U = true;
    }

    final static int a(byte param0, int param1, int param2) {
        if (param0 != 41) {
            return 42;
        }
        return param2 - -ok.a(tp.field_v, -120, -param2 + 1 - -param1);
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (((od) this).field_Lb.length <= var2) {
            L1: {
              if (param0 <= -87) {
                break L1;
              } else {
                field_Fb = null;
                break L1;
              }
            }
            return;
          } else {
            if (var2 != ((od) this).field_Jb) {
              if (((od) this).field_Lb[var2].field_P != 0) {
                ((od) this).field_Lb[((od) this).field_Jb].field_U = false;
                ((od) this).field_Mb[((od) this).field_Jb].field_D = ((od) this).field_Mb[((od) this).field_Jb].field_D + 10000;
                ((od) this).field_Jb = var2;
                ((od) this).field_Lb[var2].field_U = true;
                ((od) this).field_Mb[var2].field_D = ((od) this).field_Mb[var2].field_D - 10000;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final static sn a(fm param0, int param1, int param2) {
        byte[] var4 = param0.b(param1, -110);
        byte[] var3 = var4;
        if (param2 != -30805) {
            field_Gb = -114;
        }
        if (var4 == null) {
            return null;
        }
        return new sn(var4);
    }

    public static void j(int param0) {
        if (param0 != 15967) {
            return;
        }
        field_Nb = null;
        field_Fb = null;
        field_Ib = null;
        field_Eb = null;
        field_Hb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Nb = "Single-player game";
        field_Hb = "Close";
        field_Eb = "Quick Chat game";
        field_Fb = "Players: ";
        field_Ib = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
