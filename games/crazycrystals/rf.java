/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

class rf extends pc {
    private fo field_D;
    private wb field_B;
    static int field_G;
    static dl field_C;
    private String[] field_F;

    final void b(boolean param0) {
        int var2 = 0;
        fi var3 = null;
        tb var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        bh var12 = null;
        int var13 = 0;
        int var14 = 0;
        fo var15 = null;
        int var16 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        var16 = CrazyCrystals.field_B;
        ((rf) this).field_B = new wb();
        var2 = 0;
        var3 = (fi) (Object) ((rf) this).field_i;
        var4 = var3.a((qm) this, 1);
        L0: while (true) {
          var5 = ((rf) this).field_o.indexOf("<hotspot=", var2);
          if (-1 != var5) {
            var7 = ((rf) this).field_o.indexOf(">", var5);
            var6 = ((rf) this).field_o.substring(var5 + 9, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((rf) this).field_o.indexOf("</hotspot>", var5);
            var8 = var4.b(var5, 62);
            var9 = var4.b(var2, 62);
            var10 = null;
            var11 = var8;
            L1: while (true) {
              if (var11 > var9) {
                continue L0;
              } else {
                L2: {
                  var12 = var4.field_h[var11];
                  if (var11 == var8) {
                    stackOut_7_0 = var4.a(var5, 1);
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    stackOut_6_0 = var12.field_e[0];
                    stackIn_8_0 = stackOut_6_0;
                    break L2;
                  }
                }
                L3: {
                  var13 = stackIn_8_0;
                  if (var9 != var11) {
                    if (var12 == null) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      stackOut_11_0 = var12.field_e[-1 + var12.field_e.length];
                      stackIn_13_0 = stackOut_11_0;
                      break L3;
                    }
                  } else {
                    stackOut_9_0 = var4.a(var2, 1);
                    stackIn_13_0 = stackOut_9_0;
                    break L3;
                  }
                }
                L4: {
                  var14 = stackIn_13_0;
                  var15 = new fo(var7, var13, var12.field_f, var14 - var13, Math.max(var3.a(79), var12.field_b - var12.field_f));
                  if (var10 == null) {
                    break L4;
                  } else {
                    ((fo) var10).field_k = var15;
                    break L4;
                  }
                }
                ((rf) this).field_B.b(0, (jb) (Object) var15);
                var10 = (Object) (Object) var15;
                var11++;
                continue L1;
              }
            }
          } else {
            L5: {
              if (param0) {
                break L5;
              } else {
                ((rf) this).a(89, (byte) 16, 73, -80);
                break L5;
              }
            }
            return;
          }
        }
    }

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -35) {
                break L1;
              } else {
                rf.e((byte) 56);
                break L1;
              }
            }
            stackOut_2_0 = nk.a(false, (byte) 66, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("rf.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    String a(byte param0) {
        if (null == ((rf) this).field_D) {
            return null;
        }
        if (((rf) this).field_F == null) {
            return null;
        }
        if (((rf) this).field_F.length <= ((rf) this).field_D.field_n) {
            return null;
        }
        if (param0 >= -23) {
            return null;
        }
        return ((rf) this).field_F[((rf) this).field_D.field_n];
    }

    final static void a(int param0) {
        if (param0 != 3) {
            rf.e((byte) 124);
        }
        qe.field_g.g((byte) -119);
        if (!(null != td.field_b)) {
            td.field_b = new kl(qe.field_g, sd.field_T);
        }
        qe.field_g.b(param0 ^ -3261, (qm) (Object) td.field_b);
    }

    final static void a(jb param0, jb param1, int param2) {
        try {
            if (!(param1.field_d == null)) {
                param1.a(false);
            }
            param1.field_b = param0;
            param1.field_d = param0.field_d;
            param1.field_d.field_b = param1;
            param1.field_b.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "rf.C(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + 47 + 41);
        }
    }

    public static void e(byte param0) {
        if (param0 >= -20) {
            return;
        }
        field_C = null;
    }

    void a(qm param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, -114, param2, param3);
              ((rf) this).field_D = null;
              var5_int = 37 / ((param1 - -50) / 59);
              if (!((rf) this).field_m) {
                break L1;
              } else {
                var6 = -((rf) this).field_r + -param3 + qh.field_i;
                var7 = -param2 + (bm.field_h + -((rf) this).field_j);
                ((rf) this).field_D = this.a(var7, var6, 3);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("rf.N(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static java.net.URL a(int param0, String param1, boolean param2, String param3, java.net.URL param4) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            Object var10 = null;
            java.net.URL stackIn_41_0 = null;
            java.net.URL stackIn_43_0 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            String stackIn_47_2 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            String stackIn_53_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_40_0 = null;
            java.net.URL stackOut_42_0 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            String stackOut_52_2 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            String stackOut_51_2 = null;
            var9 = CrazyCrystals.field_B;
            try {
              L0: {
                if (param2) {
                  break L0;
                } else {
                  var10 = null;
                  String discarded$10 = rf.a((CharSequence) null, -46);
                  break L0;
                }
              }
              var5_ref = param4.getFile();
              var6 = 0;
              L1: while (true) {
                L2: {
                  if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', var6 - -1);
                    if (0 > var7_int) {
                      break L2;
                    } else {
                      if (0 <= param0) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L1;
                      } else {
                        var6 = var7_int;
                        continue L1;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int < 0) {
                      break L3;
                    } else {
                      var6 = var7_int;
                      continue L1;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                    break L4;
                  } else {
                    var7_int = var5_ref.indexOf('/', var6 - -1);
                    if (var7_int < 0) {
                      break L4;
                    } else {
                      if (param3 != null) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L1;
                      } else {
                        var6 = var7_int;
                        continue L1;
                      }
                    }
                  }
                }
                L5: {
                  L6: {
                    if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                      break L6;
                    } else {
                      if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var7_int = var5_ref.indexOf('/', 1 + var6);
                  if (0 <= var7_int) {
                    if (param1 == null) {
                      var6 = var7_int;
                      continue L1;
                    } else {
                      var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                      continue L1;
                    }
                  } else {
                    break L5;
                  }
                }
                L7: {
                  var7 = new StringBuilder(var6);
                  StringBuilder discarded$11 = var7.append(var5_ref.substring(0, var6));
                  if (param0 > 0) {
                    StringBuilder discarded$12 = var7.append("/l=");
                    StringBuilder discarded$13 = var7.append(Integer.toString(param0));
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param3 == null) {
                    break L8;
                  } else {
                    if (param3.length() > 0) {
                      StringBuilder discarded$14 = var7.append("/p=");
                      StringBuilder discarded$15 = var7.append(param3);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (param1 == null) {
                    break L9;
                  } else {
                    if (0 >= param1.length()) {
                      break L9;
                    } else {
                      StringBuilder discarded$16 = var7.append("/s=");
                      StringBuilder discarded$17 = var7.append(param1);
                      break L9;
                    }
                  }
                }
                L10: {
                  if (var6 >= var5_ref.length()) {
                    StringBuilder discarded$18 = var7.append(47);
                    break L10;
                  } else {
                    StringBuilder discarded$19 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                    break L10;
                  }
                }
                try {
                  L11: {
                    stackOut_40_0 = new java.net.URL(param4, var7.toString());
                    stackIn_41_0 = stackOut_40_0;
                    break L11;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8 = (Exception) (Object) decompiledCaughtException;
                  var8.printStackTrace();
                  stackOut_42_0 = (java.net.URL) param4;
                  stackIn_43_0 = stackOut_42_0;
                  return stackIn_43_0;
                }
                return stackIn_41_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_44_0 = (RuntimeException) var5;
                stackOut_44_1 = new StringBuilder().append("rf.B(").append(param0).append(44);
                stackIn_46_0 = stackOut_44_0;
                stackIn_46_1 = stackOut_44_1;
                stackIn_45_0 = stackOut_44_0;
                stackIn_45_1 = stackOut_44_1;
                if (param1 == null) {
                  stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                  stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                  stackOut_46_2 = "null";
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  stackIn_47_2 = stackOut_46_2;
                  break L12;
                } else {
                  stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                  stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                  stackOut_45_2 = "{...}";
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  stackIn_47_2 = stackOut_45_2;
                  break L12;
                }
              }
              L13: {
                stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(44).append(param2).append(44);
                stackIn_49_0 = stackOut_47_0;
                stackIn_49_1 = stackOut_47_1;
                stackIn_48_0 = stackOut_47_0;
                stackIn_48_1 = stackOut_47_1;
                if (param3 == null) {
                  stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                  stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                  stackOut_49_2 = "null";
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  break L13;
                } else {
                  stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                  stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
                  stackOut_48_2 = "{...}";
                  stackIn_50_0 = stackOut_48_0;
                  stackIn_50_1 = stackOut_48_1;
                  stackIn_50_2 = stackOut_48_2;
                  break L13;
                }
              }
              L14: {
                stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
                stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(44);
                stackIn_52_0 = stackOut_50_0;
                stackIn_52_1 = stackOut_50_1;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                if (param4 == null) {
                  stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
                  stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
                  stackOut_52_2 = "null";
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  stackIn_53_2 = stackOut_52_2;
                  break L14;
                } else {
                  stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                  stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
                  stackOut_51_2 = "{...}";
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_53_1 = stackOut_51_1;
                  stackIn_53_2 = stackOut_51_2;
                  break L14;
                }
              }
              throw dn.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 > -75) {
            field_G = -115;
        }
        super.a(param0, param1, -113, param3);
        int var5 = -((rf) this).field_r + param1;
        int var6 = param0 - ((rf) this).field_j;
        fo var7 = this.a(var6, var5, 3);
        if (var7 != null) {
            if (!(((rf) this).field_l == null)) {
                ((im) (Object) ((rf) this).field_l).a(var7.field_n, param3, (rf) this, (byte) -128);
            }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        ((rf) this).a(((fi) (Object) ((rf) this).field_i).c((qm) this, -1), param2, param0, param3, (byte) -52);
        if (param1 != 47) {
            ((rf) this).field_B = null;
        }
    }

    boolean a(boolean param0, qm param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("rf.P(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final void a(int param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param0 == 47) {
                break L1;
              } else {
                ((rf) this).field_B = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == ((rf) this).field_F) {
                  break L3;
                } else {
                  if (param2 >= ((rf) this).field_F.length) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                var7 = new String[1 + param2];
                var8 = var7;
                var4 = var8;
                if (((rf) this).field_F != null) {
                  var5 = 0;
                  L5: while (true) {
                    if (var5 >= ((rf) this).field_F.length) {
                      break L4;
                    } else {
                      var7[var5] = ((rf) this).field_F[var5];
                      var5++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              ((rf) this).field_F = var8;
              break L2;
            }
            ((rf) this).field_F[param2] = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("rf.G(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 41);
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, (byte) -33, param2, param3);
        if (param1 >= -12) {
            Object var9 = null;
            String discarded$0 = rf.a((CharSequence) null, 14);
        }
        if (!(0 == param3)) {
            return;
        }
        fi var10 = (fi) (Object) ((rf) this).field_i;
        fo var6 = ((rf) this).field_D;
        if (var6 == null) {
        } else {
            var7 = var10.a(-527227295, (qm) this, param2);
            var8 = var10.a(param0, (byte) 50, (qm) this);
            do {
                ci.a(var6.field_f + var7 + -2, -2 + (var6.field_h + var8), false, 2 + var6.field_l, var6.field_j + 2);
                var6 = var6.field_k;
            } while (var6 != null);
        }
    }

    rf(String param0, wo param1) {
        super(param0, (bi) null);
        ((rf) this).field_D = null;
        try {
            ((rf) this).field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "rf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        super.a(param0, param1, param2, param3, param4);
        ((rf) this).b(true);
    }

    private final fo a(int param0, int param1, int param2) {
        fo var4 = null;
        fo var5 = null;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        var4 = (fo) (Object) ((rf) this).field_B.g(32073);
        L0: while (true) {
          if (var4 != null) {
            var5 = var4;
            L1: while (true) {
              if (var5 == null) {
                var4 = (fo) (Object) ((rf) this).field_B.a(false);
                continue L0;
              } else {
                L2: {
                  if (var5.field_f > param1) {
                    break L2;
                  } else {
                    if (var5.field_h > param0) {
                      break L2;
                    } else {
                      if (var5.field_f - -var5.field_j <= param1) {
                        break L2;
                      } else {
                        if (param0 > var5.field_l + var5.field_h) {
                          break L2;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_k;
                continue L1;
              }
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = -1;
    }
}
