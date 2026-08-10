/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rf extends pc {
    private fo field_D;
    private wb field_B;
    static int field_G;
    static dl field_C;
    private String[] field_F;

    final void b(boolean param0) {
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int var2;
        fi var3;
        tb var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        int var11;
        bh var12;
        int var13;
        int var14;
        fo var15;
        int var16;
        var16 = CrazyCrystals.field_B;
        this.field_B = new wb();
        var2 = 0;
        var3 = (fi) ((Object) this.field_i);
        var4 = var3.a((qm) (this), 1);
        L0: while (true) {
          var5 = this.field_o.indexOf("<hotspot=", var2);
          if (-1 != var5) {
            var7 = this.field_o.indexOf(">", var5);
            var6 = this.field_o.substring(var5 + 9, var7);
            var7 = Integer.parseInt(var6);
            var2 = this.field_o.indexOf("</hotspot>", var5);
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
                  if ((var11 ^ -1) == (var8 ^ -1)) {
                    stackIn_8_0 = var4.a(var5, 1);
                    break L2;
                  } else {
                    stackIn_8_0 = var12.field_e[0];
                    break L2;
                  }
                }
                L3: {
                  var13 = stackIn_8_0;
                  if (var9 != var11) {
                    if (var12 == null) {
                      stackIn_13_0 = 0;
                      break L3;
                    } else {
                      stackIn_13_0 = var12.field_e[-1 + var12.field_e.length];
                      break L3;
                    }
                  } else {
                    stackIn_13_0 = var4.a(var2, 1);
                    break L3;
                  }
                }
                L4: {
                  var14 = stackIn_13_0;
                  var15 = new fo(var7, var13, var12.field_f, var14 - var13, Math.max(var3.a(79), var12.field_b - var12.field_f));
                  if (var10 == null) {
                    break L4;
                  } else {
                    ((fo) (var10)).field_k = var15;
                    break L4;
                  }
                }
                this.field_B.b(0, var15);
                var10 = var15;
                var11++;
                continue L1;
              }
            }
          } else {
            L5: {
              if (param0) {
                break L5;
              } else {
                this.a(89, (byte) 16, 73, -80);
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = nk.a(false, (byte) 66, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("rf.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    String a(byte param0) {
        if (null == this.field_D) {
            return null;
        }
        if (this.field_F == null) {
            return null;
        }
        if (this.field_F.length <= this.field_D.field_n) {
            return null;
        }
        if (param0 >= -23) {
            return (String) null;
        }
        return this.field_F[this.field_D.field_n];
    }

    final static void a(int param0) {
        if (param0 != 3) {
            rf.e((byte) 124);
        }
        qe.field_g.g((byte) -119);
        if (!(null != td.field_b)) {
            td.field_b = new kl(qe.field_g, sd.field_T);
        }
        qe.field_g.b(param0 ^ -3261, td.field_b);
    }

    final static void a(jb param0, jb param1, int param2) {
        try {
            if (param2 != 47) {
                rf.a(-16);
            }
            if (!(param1.field_d == null)) {
                param1.a(false);
            }
            param1.field_b = param0;
            param1.field_d = param0.field_d;
            param1.field_d.field_b = param1;
            param1.field_b.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "rf.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void e(byte param0) {
        if (param0 >= -20) {
            return;
        }
        field_C = null;
    }

    void a(qm param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        try {
            super.a(param0, -114, param2, param3);
            this.field_D = null;
            int var5_int = 37 / ((param1 - -50) / 59);
            if (this.field_m) {
                var6 = -this.field_r + -param3 + qh.field_i;
                var7 = -param2 + (bm.field_h + -this.field_j);
                this.field_D = this.a(var7, var6, 3);
            }
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "rf.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static java.net.URL a(int param0, String param1, boolean param2, String param3, java.net.URL param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            java.net.URL stackIn_41_0 = null;
            java.net.URL stackIn_43_0 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            String stackIn_47_2 = null;
            StringBuilder stackIn_49_1 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            StringBuilder stackIn_52_1 = null;
            StringBuilder stackIn_53_1 = null;
            String stackIn_53_2 = null;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            CharSequence var10 = null;
            var9 = CrazyCrystals.field_B;
            try {
              L0: {
                L1: {
                  if (param2) {
                    break L1;
                  } else {
                    var10 = (CharSequence) null;
                    rf.a((CharSequence) null, -46);
                    break L1;
                  }
                }
                var5 = param4.getFile();
                var6 = 0;
                L2: while (true) {
                  L3: {
                    if (var5.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5.indexOf('/', var6 - -1);
                      if (0 > var7_int) {
                        break L3;
                      } else {
                        if (0 <= param0) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L2;
                        } else {
                          var6 = var7_int;
                          continue L2;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var5.regionMatches(var6, "/a=", 0, 3)) {
                      var7_int = var5.indexOf('/', 1 + var6);
                      if ((var7_int ^ -1) > -1) {
                        break L4;
                      } else {
                        var6 = var7_int;
                        continue L2;
                      }
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                      break L5;
                    } else {
                      var7_int = var5.indexOf('/', var6 - -1);
                      if (-1 < (var7_int ^ -1)) {
                        break L5;
                      } else {
                        if (param3 != null) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L2;
                        } else {
                          var6 = var7_int;
                          continue L2;
                        }
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (var5.regionMatches(var6, "/s=", 0, 3)) {
                        break L7;
                      } else {
                        if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (0 <= var7_int) {
                      if (param1 == null) {
                        var6 = var7_int;
                        continue L2;
                      } else {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L2;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L8: {
                    var7 = new StringBuilder(var6);
                    discarded$0 = var7.append(var5.substring(0, var6));
                    if ((param0 ^ -1) < -1) {
                      discarded$1 = var7.append("/l=");
                      discarded$2 = var7.append(Integer.toString(param0));
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (param3 == null) {
                      break L9;
                    } else {
                      if ((param3.length() ^ -1) < -1) {
                        discarded$3 = var7.append("/p=");
                        discarded$4 = var7.append(param3);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (param1 == null) {
                      break L10;
                    } else {
                      if (0 >= param1.length()) {
                        break L10;
                      } else {
                        discarded$5 = var7.append("/s=");
                        discarded$6 = var7.append(param1);
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (var6 >= var5.length()) {
                      discarded$7 = var7.append('/');
                      break L11;
                    } else {
                      discarded$8 = var7.append(var5.substring(var6, var5.length()));
                      break L11;
                    }
                  }
                  try {
                    L12: {
                      stackIn_41_0 = new java.net.URL(param4, var7.toString());
                      break L12;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackIn_43_0 = (java.net.URL) (param4);
                    return stackIn_43_0;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L13: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_46_0 = (RuntimeException) (var5_ref);

                stackIn_46_1 = new StringBuilder().append("rf.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
                  stackIn_47_2 = "null";
                  break L13;
                } else {
                  stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
                  stackIn_47_2 = "{...}";
                  break L13;
                }
              }
              L14: {


                stackIn_49_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackIn_50_2 = "null";
                  break L14;
                } else {
                  stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackIn_50_2 = "{...}";
                  break L14;
                }
              }
              L15: {


                stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',');

                if (param4 == null) {
                  stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackIn_53_2 = "null";
                  break L15;
                } else {
                  stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackIn_53_2 = "{...}";
                  break L15;
                }
              }
              throw dn.a((Throwable) ((Object) stackIn_47_0), stackIn_53_2 + ')');
            }
            return stackIn_41_0;
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
        int var5 = -this.field_r + param1;
        int var6 = param0 - this.field_j;
        fo var7 = this.a(var6, var5, 3);
        if (var7 != null) {
            if (!(this.field_l == null)) {
                ((im) ((Object) this.field_l)).a(var7.field_n, param3, (rf) (this), (byte) -128);
            }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.a(((fi) ((Object) this.field_i)).c((qm) (this), -1), param2, param0, param3, (byte) -52);
        if (param1 != 47) {
            this.field_B = (wb) null;
        }
    }

    boolean a(boolean param0, qm param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("rf.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param0 == 47) {
                break L1;
              } else {
                this.field_B = (wb) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_F) {
                  break L3;
                } else {
                  if (param2 >= this.field_F.length) {
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
                if (this.field_F != null) {
                  var5 = 0;
                  L5: while (true) {
                    if (var5 >= this.field_F.length) {
                      break L4;
                    } else {
                      var7[var5] = this.field_F[var5];
                      var5++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              this.field_F = var8;
              break L2;
            }
            this.field_F[param2] = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (runtimeException);

            stackIn_16_1 = new StringBuilder().append("rf.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, (byte) -33, param2, param3);
        if (param1 >= -12) {
            CharSequence var9 = (CharSequence) null;
            rf.a((CharSequence) null, 14);
        }
        if (!(0 == param3)) {
            return;
        }
        fi var10 = (fi) ((Object) this.field_i);
        fo var6 = this.field_D;
        if (var6 == null) {
        } else {
            var7 = var10.a(-527227295, (qm) (this), param2);
            var8 = var10.a(param0, (byte) 50, (qm) (this));
            do {
                ci.a(var6.field_f + var7 + -2, -2 + (var6.field_h + var8), false, 2 + var6.field_l, var6.field_j + 2);
                var6 = var6.field_k;
            } while (var6 != null);
        }
    }

    rf(String param0, wo param1) {
        super(param0, (bi) null);
        this.field_D = null;
        try {
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "rf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        super.a(param0, param1, param2, param3, param4);
        this.b(true);
    }

    private final fo a(int param0, int param1, int param2) {
        fo var4;
        fo var5;
        int var6;
        java.net.URL var7;
        L0: {
          var6 = CrazyCrystals.field_B;
          if (param2 == 3) {
            break L0;
          } else {
            var7 = (java.net.URL) null;
            rf.a(-35, (String) null, true, (String) null, (java.net.URL) null);
            break L0;
          }
        }
        var4 = (fo) ((Object) this.field_B.g(32073));
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (fo) ((Object) this.field_B.a(false));
                continue L1;
              } else {
                L3: {
                  if (var5.field_f > param1) {
                    break L3;
                  } else {
                    if (var5.field_h > param0) {
                      break L3;
                    } else {
                      if (var5.field_f - -var5.field_j <= param1) {
                        break L3;
                      } else {
                        if (param0 > var5.field_l + var5.field_h) {
                          break L3;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_k;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    static {
        field_G = -1;
    }
}
