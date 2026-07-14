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
        int var2 = 0;
        fi var3 = null;
        tb var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        fo var10 = null;
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
                    var10.field_k = var15;
                    break L4;
                  }
                }
                ((rf) this).field_B.b(0, (jb) (Object) var15);
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
                ((rf) this).a(89, (byte) 16, 73, -80);
                break L5;
              }
            }
            return;
          }
        }
    }

    final static String a(CharSequence param0, int param1) {
        if (param1 >= -35) {
            rf.e((byte) 56);
        }
        return nk.a(false, (byte) 66, param0);
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
        super.a(param0, -114, param2, param3);
        ((rf) this).field_D = null;
        int var5 = 37 / ((param1 - -50) / 59);
        if (((rf) this).field_m) {
            var6 = -((rf) this).field_r + -param3 + qh.field_i;
            var7 = -param2 + (bm.field_h + -((rf) this).field_j);
            ((rf) this).field_D = this.a(var7, var6, 3);
        }
    }

    final static java.net.URL a(int param0, String param1, boolean param2, String param3, java.net.URL param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            Object var10 = null;
            java.net.URL stackIn_41_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_40_0 = null;
            L0: {
              var9 = CrazyCrystals.field_B;
              if (param2) {
                break L0;
              } else {
                var10 = null;
                String discarded$10 = rf.a((CharSequence) null, -46);
                break L0;
              }
            }
            var5 = param4.getFile();
            var6 = 0;
            L1: while (true) {
              L2: {
                if (var5.regionMatches(var6, "/l=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (0 > var7_int) {
                    break L2;
                  } else {
                    if (0 <= param0) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
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
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if ((var7_int ^ -1) > -1) {
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
                if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                  break L4;
                } else {
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (-1 < (var7_int ^ -1)) {
                    break L4;
                  } else {
                    if (param3 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
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
                  if (var5.regionMatches(var6, "/s=", 0, 3)) {
                    break L6;
                  } else {
                    if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                var7_int = var5.indexOf('/', 1 + var6);
                if (0 <= var7_int) {
                  if (param1 == null) {
                    var6 = var7_int;
                    continue L1;
                  } else {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue L1;
                  }
                } else {
                  break L5;
                }
              }
              L7: {
                var7 = new StringBuilder(var6);
                StringBuilder discarded$11 = var7.append(var5.substring(0, var6));
                if ((param0 ^ -1) < -1) {
                  StringBuilder discarded$12 = var7.append("/l=");
                  StringBuilder discarded$13 = var7.append(Integer.toString(param0));
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (param3 == null) {
                  if (param1 == null) {
                    break L8;
                  } else {
                    if (0 >= param1.length()) {
                      break L8;
                    } else {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param1);
                      break L8;
                    }
                  }
                } else {
                  if (param1 == null) {
                    break L8;
                  } else {
                    if (0 >= param1.length()) {
                      break L8;
                    } else {
                      StringBuilder discarded$16 = var7.append("/s=");
                      StringBuilder discarded$17 = var7.append(param1);
                      break L8;
                    }
                  }
                }
              }
              L9: {
                if (var6 >= var5.length()) {
                  StringBuilder discarded$18 = var7.append(47);
                  break L9;
                } else {
                  StringBuilder discarded$19 = var7.append(var5.substring(var6, var5.length()));
                  break L9;
                }
              }
              try {
                stackOut_40_0 = new java.net.URL(param4, var7.toString());
                stackIn_41_0 = stackOut_40_0;
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return stackIn_41_0;
              }
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
        if (!param0) {
            return true;
        }
        return false;
    }

    final void a(int param0, String param1, int param2) {
        String[] var7 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        if (param0 != 47) {
            ((rf) this).field_B = null;
        }
        if (null != ((rf) this).field_F) {
            // if_icmpge L42
        } else {
            var7 = new String[1 + param2];
            var4 = var7;
            if (!(((rf) this).field_F == null)) {
                for (var5 = 0; var5 < ((rf) this).field_F.length; var5++) {
                    var7[var5] = ((rf) this).field_F[var5];
                }
            }
            ((rf) this).field_F = var4;
        }
        ((rf) this).field_F[param2] = param1;
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
        ((rf) this).field_i = param1;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        super.a(param0, param1, param2, param3, param4);
        ((rf) this).b(true);
    }

    private final fo a(int param0, int param1, int param2) {
        fo var4 = null;
        fo var5 = null;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = CrazyCrystals.field_B;
          if (param2 == 3) {
            break L0;
          } else {
            var7 = null;
            java.net.URL discarded$2 = rf.a(-35, (String) null, true, (String) null, (java.net.URL) null);
            break L0;
          }
        }
        var4 = (fo) (Object) ((rf) this).field_B.g(32073);
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (fo) (Object) ((rf) this).field_B.a(false);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = -1;
    }
}
