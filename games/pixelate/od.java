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
        ak dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          if (param0 >= 103) {
            break L0;
          } else {
            this.b((byte) 55);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (this.field_Lb.length <= var4) {
            this.field_Kb.a(param1, this.field_nb + -param1, 0, 256, this.field_K);
            var8 = 0;
            var4 = var8;
            L2: while (true) {
              if (var8 >= this.field_Mb.length) {
                return;
              } else {
                this.field_Mb[var8].a(param2, -(2 * param2) + this.field_Kb.field_nb, param2, 256, -(param2 * 2) + this.field_Kb.field_K);
                if (this.field_Jb != var8) {
                  dupTemp$0 = this.field_Mb[var8];
                  dupTemp$0.field_D = dupTemp$0.field_D + 10000;
                  var8++;
                  continue L2;
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            var5 = this.field_K * var4 / this.field_Lb.length;
            var6 = this.field_K * (var4 + 1) / this.field_Lb.length;
            this.field_Lb[var4].field_D = var5;
            this.field_Lb[var4].field_S = 0;
            this.field_Lb[var4].field_K = var6 - var5;
            this.field_Lb[var4].field_nb = param1;
            var4++;
            continue L1;
          }
        }
    }

    final static void a(int param0, we param1, int param2, cb param3) {
        try {
            byte[] array$0 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            StringBuilder stackIn_39_1 = null;
            StringBuilder stackIn_40_1 = null;
            String stackIn_40_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
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
            var14 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
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
                L1: while (true) {
                  if (var5 >= var17.field_s) {
                    ma.field_o.a(22125, var17);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var6_int = param1.f(255);
                            if (var6_int == 0) {
                              break L4;
                            } else {
                              if (1 == var6_int) {
                                break L4;
                              } else {
                                if ((var6_int ^ -1) != -3) {
                                  L5: {
                                    if ((var6_int ^ -1) == -4) {
                                      break L5;
                                    } else {
                                      if (-5 == (var6_int ^ -1)) {
                                        break L5;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  var19 = param1.h(param0 + 10);
                                  var8 = param1.h(5);
                                  var9 = param1.f(255);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L6: while (true) {
                                    if (var11_int >= var9) {
                                      L7: {
                                        var20 = new byte[var9][];
                                        var18 = var20;
                                        var11 = var18;
                                        if (3 == var6_int) {
                                          var12_int = 0;
                                          L8: while (true) {
                                            if (var9 <= var12_int) {
                                              break L7;
                                            } else {
                                              var13 = param1.k(param0 + 5);
                                              array$0 = new byte[var13];
                                              var11[var12_int] = array$0;
                                              param1.a(var20[var12_int], 0, -76, var13);
                                              var12_int++;
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          break L7;
                                        }
                                      }
                                      var17.field_r[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var16 = 0;
                                      var13 = var16;
                                      L9: while (true) {
                                        if (var16 >= var9) {
                                          var17.field_v[var5] = param3.a(0, var12, var8, i.a(var19, -115));
                                          var17.field_w[var5] = var20;
                                          break L3;
                                        } else {
                                          var12[var16] = i.a(var10[var16], -113);
                                          var16++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param1.h(5);
                                      var11_int++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          L10: {
                            var15 = param1.h(param0 ^ -2);
                            var7 = var15;
                            var8 = param1.h(param0 + 10);
                            var9 = 0;
                            if (var6_int != 1) {
                              break L10;
                            } else {
                              var9 = param1.k(param0 + 5);
                              break L10;
                            }
                          }
                          var17.field_r[var5] = var6_int;
                          var17.field_q[var5] = var9;
                          var17.field_l[var5] = param3.a(var8, i.a(var15, bn.a(param0, 121)), (byte) -94);
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var17.field_u[var5] = -1;
                        break L11;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L12: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var17.field_u[var5] = -2;
                        break L12;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var17.field_u[var5] = -3;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var17.field_u[var5] = -4;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var6_ref4 = decompiledCaughtException;
                        var17.field_u[var5] = -5;
                        break L15;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_36_0 = (RuntimeException) (var4);

                stackIn_36_1 = new StringBuilder().append("od.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                  stackIn_37_2 = "null";
                  break L16;
                } else {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                  stackIn_37_2 = "{...}";
                  break L16;
                }
              }
              L17: {


                stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackIn_40_2 = "null";
                  break L17;
                } else {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackIn_40_2 = "{...}";
                  break L17;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_37_0), stackIn_40_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_S = param1;
        this.field_K = param3;
        this.field_nb = param4;
        this.field_D = param6;
        if (param0 != -19360) {
            field_Hb = (String) null;
        }
        this.a(116, param5, param2);
    }

    od(long param0, ak param1, String[] param2, ak param3, ak[] param4, int param5) {
        super(param0, (ak) null);
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        ak var9 = null;
        int var11 = 0;
        try {
          L0: {
            this.field_Lb = new ak[param2.length];
            this.field_Kb = new ak(0L, param3);
            this.field_Mb = param4;
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= param2.length) {
                this.a(this.field_Kb, (byte) 26);
                var11 = 0;
                var8_int = var11;
                L2: while (true) {
                  if (param4.length <= var11) {
                    this.field_Jb = param5;
                    this.field_Lb[param5].field_U = true;
                    break L0;
                  } else {
                    this.field_Kb.a(param4[var11], (byte) 26);
                    var11++;
                    continue L2;
                  }
                }
              } else {
                var9 = new ak(0L, param1);
                var9.field_cb = param2[var8_int];
                this.field_Lb[var8_int] = var9;
                this.a(var9, (byte) 26);
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var8);

            stackIn_11_1 = new StringBuilder().append("od.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_21_2 + ',' + param5 + ')');
        }
    }

    final static int a(byte param0, int param1, int param2) {
        if (param0 != 41) {
            return 42;
        }
        return param2 - -ok.a(tp.field_v, -120, -param2 + 1 - -param1);
    }

    final void b(byte param0) {
        ak dupTemp$0 = null;
        ak dupTemp$1 = null;
        int var2;
        int var3;
        var3 = Pixelate.field_H ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (this.field_Lb.length <= var2) {
            L1: {
              if (param0 <= -87) {
                break L1;
              } else {
                field_Fb = (String) null;
                break L1;
              }
            }
            return;
          } else {
            if (var2 != this.field_Jb) {
              if (this.field_Lb[var2].field_P != 0) {
                this.field_Lb[this.field_Jb].field_U = false;
                dupTemp$0 = this.field_Mb[this.field_Jb];
                dupTemp$0.field_D = dupTemp$0.field_D + 10000;
                this.field_Jb = var2;
                this.field_Lb[var2].field_U = true;
                dupTemp$1 = this.field_Mb[var2];
                dupTemp$1.field_D = dupTemp$1.field_D - 10000;
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
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        sn stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = param0.b(param1, -110);
              var3 = var4;
              if (param2 == -30805) {
                break L1;
              } else {
                field_Gb = -114;
                break L1;
              }
            }
            if (var4 != null) {
              stackIn_6_0 = new sn(var4);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("od.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
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
        field_Nb = "Single-player game";
        field_Hb = "Close";
        field_Eb = "Quick Chat game";
        field_Fb = "Players: ";
        field_Ib = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
