/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class kj extends pj {
    static gj field_P;
    static ff field_J;
    static long field_I;
    private nc field_L;
    private li field_Q;
    static String field_K;
    static o field_S;
    static int field_R;
    private String[] field_M;
    static String field_N;
    static int field_O;

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        ((kj) this).a((byte) -21);
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            java.net.URL var3 = null;
            try {
                var3 = new java.net.URL(param0.getCodeBase(), param2);
                if (param1 < 103) {
                    Object var4 = null;
                    boolean discarded$0 = kj.a((String) null, (byte) -16);
                }
                var3 = kk.a(98, var3, param0);
                ke.a((byte) -98, param0, var3.toString(), true);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!param0) {
            field_R = -105;
        }
        int var5 = param1 - ((kj) this).field_m;
        int var6 = -((kj) this).field_j + param3;
        li var7 = this.a(var6, (byte) 22, var5);
        if (var7 != null) {
            if (null != ((kj) this).field_n) {
                ((re) (Object) ((kj) this).field_n).a(param2, var7.field_l, 50, (kj) this);
            }
        }
    }

    final static boolean a(String param0, byte param1) {
        if (param1 > -7) {
            field_I = -117L;
        }
        CharSequence var3 = (CharSequence) (Object) param0;
        return kf.field_D.equals((Object) (Object) jg.a(var3, -2));
    }

    kj(String param0, j param1) {
        super(param0, (dg) null);
        ((kj) this).field_Q = null;
        ((kj) this).field_w = param1;
    }

    boolean a(int param0, rc param1) {
        if (param0 != -1463) {
            ((kj) this).b(122, 127, -75, 58);
        }
        return false;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(param1 == 0)) {
            return;
        }
        eg var5 = (eg) (Object) ((kj) this).field_w;
        li var6 = ((kj) this).field_Q;
        if (var6 == null) {
        } else {
            var7 = var5.a(param2, (rc) this, 0);
            var8 = var5.a((rc) this, false, param0);
            do {
                ci.a(2 + var6.field_m, -2 + var6.field_n + var8, 2 + var6.field_i, -2 + var6.field_o + var7, (byte) 123);
                var6 = var6.field_k;
            } while (var6 != null);
        }
    }

    final static String a(byte param0, Throwable param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        ve var15 = null;
        StringWriter var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        L0: {
          var13 = SolKnight.field_L ? 1 : 0;
          if (param0 == 105) {
            break L0;
          } else {
            var14 = null;
            kj.a((java.applet.Applet) null, 117, (String) null);
            break L0;
          }
        }
        L1: {
          if (param1 instanceof ve) {
            var15 = (ve) (Object) param1;
            param1 = var15.field_c;
            var2 = var15.field_d + " | ";
            var11 = var2;
            break L1;
          } else {
            var2 = "";
            break L1;
          }
        }
        var16 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var16);
        param1.printStackTrace(var4);
        var4.close();
        var5 = var16.toString();
        var2 = var5;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var2 = var7;
        var11 = var7;
        L2: while (true) {
          var8 = var6.readLine();
          var2 = var8;
          var11 = var8;
          var2 = var11;
          if (var8 != null) {
            L3: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if (0 != (var9 ^ -1)) {
                var11 = var8.substring(0, var9);
                var2 = var11;
                var2 = var11;
                break L3;
              } else {
                var11 = var8;
                break L3;
              }
            }
            L4: {
              var17 = var11.trim();
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(1 + var17.lastIndexOf(' '));
              var2 = var18;
              var2 = var18;
              var19 = var18.substring(var18.lastIndexOf('\t') + 1);
              var2 = var19;
              var2 = var19;
              var20 = var2 + var19;
              var2 = var20;
              var2 = var20;
              if (0 == (var9 ^ -1)) {
                break L4;
              } else {
                if ((var10 ^ -1) != 0) {
                  var12 = var8.indexOf(".java:", var9);
                  if ((var12 ^ -1) > -1) {
                    break L4;
                  } else {
                    var2 = var20 + var8.substring(var12 - -5, var10);
                    break L4;
                  }
                } else {
                  var2 = var2 + 32;
                  continue L2;
                }
              }
            }
            var2 = var2 + 32;
            continue L2;
          } else {
            var2 = var11;
            var11 = var2;
            var2 = var11;
            var2 = var2 + "| " + var7;
            return var2;
          }
        }
    }

    final void a(int param0, String param1, int param2) {
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        String[] var8 = null;
        L0: {
          L1: {
            var6 = SolKnight.field_L ? 1 : 0;
            if (null == ((kj) this).field_M) {
              break L1;
            } else {
              if (param0 < ((kj) this).field_M.length) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var8 = new String[param0 + 1];
            var4 = var8;
            if (((kj) this).field_M != null) {
              var5 = 0;
              L3: while (true) {
                if (((kj) this).field_M.length <= var5) {
                  break L2;
                } else {
                  var8[var5] = ((kj) this).field_M[var5];
                  var5++;
                  continue L3;
                }
              }
            } else {
              break L2;
            }
          }
          ((kj) this).field_M = var4;
          break L0;
        }
        L4: {
          if (param2 == 1) {
            break L4;
          } else {
            var7 = null;
            kj.a((java.applet.Applet) null, -17, (String) null);
            break L4;
          }
        }
        ((kj) this).field_M[param0] = param1;
    }

    public static void a(int param0) {
        field_N = null;
        field_K = null;
        if (param0 != 2) {
            Object var2 = null;
            kj.a((java.applet.Applet) null, 14, (String) null);
        }
        field_J = null;
        field_P = null;
        field_S = null;
    }

    final void a(byte param0) {
        int var2 = 0;
        eg var3 = null;
        jf var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        le var12 = null;
        int var13 = 0;
        int var14 = 0;
        li var15 = null;
        int var16 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var16 = SolKnight.field_L ? 1 : 0;
        ((kj) this).field_L = new nc();
        var2 = 0;
        var3 = (eg) (Object) ((kj) this).field_w;
        var4 = var3.a(-21480, (rc) this);
        L0: while (true) {
          var5 = ((kj) this).field_i.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            L1: {
              if (param0 == -21) {
                break L1;
              } else {
                field_O = -95;
                break L1;
              }
            }
            return;
          } else {
            var7 = ((kj) this).field_i.indexOf(">", var5);
            var6 = ((kj) this).field_i.substring(var5 - -9, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((kj) this).field_i.indexOf("</hotspot>", var5);
            var8 = var4.a((byte) -121, var5);
            var9 = var4.a((byte) -115, var2);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var11 > var9) {
                continue L0;
              } else {
                L3: {
                  var12 = var4.field_c[var11];
                  if (var8 != var11) {
                    stackOut_6_0 = var12.field_c[0];
                    stackIn_7_0 = stackOut_6_0;
                    break L3;
                  } else {
                    stackOut_5_0 = var4.a(0, var5);
                    stackIn_7_0 = stackOut_5_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_7_0;
                  if (var11 == var9) {
                    stackOut_11_0 = var4.a(0, var2);
                    stackIn_12_0 = stackOut_11_0;
                    break L4;
                  } else {
                    if (var12 == null) {
                      stackOut_10_0 = 0;
                      stackIn_12_0 = stackOut_10_0;
                      break L4;
                    } else {
                      stackOut_9_0 = var12.field_c[-1 + var12.field_c.length];
                      stackIn_12_0 = stackOut_9_0;
                      break L4;
                    }
                  }
                }
                L5: {
                  var14 = stackIn_12_0;
                  var15 = new li(var7, var13, var12.field_g, -var13 + var14, Math.max(var3.a(3), -var12.field_g + var12.field_e));
                  if (var10 != null) {
                    ((li) var10).field_k = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((kj) this).field_L.a((gg) (Object) var15, -7044);
                var10 = (Object) (Object) var15;
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    String c(byte param0) {
        if (null == ((kj) this).field_Q) {
            return null;
        }
        if (((kj) this).field_M == null) {
            return null;
        }
        if (param0 < 14) {
            return null;
        }
        if (((kj) this).field_M.length <= ((kj) this).field_Q.field_l) {
            return null;
        }
        return ((kj) this).field_M[((kj) this).field_Q.field_l];
    }

    void a(int param0, int param1, int param2, rc param3) {
        int var5 = 0;
        int var6 = 0;
        if (param1 != 18874) {
            return;
        }
        super.a(param0, param1 ^ 0, param2, param3);
        ((kj) this).field_Q = null;
        if (!(!((kj) this).field_v)) {
            var5 = -param0 + (gb.field_j - ((kj) this).field_m);
            var6 = -((kj) this).field_j + (ad.field_m - param2);
            ((kj) this).field_Q = this.a(var6, (byte) 22, var5);
        }
    }

    private final li a(int param0, byte param1, int param2) {
        li var4 = null;
        li var5 = null;
        int var6 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        var4 = (li) (Object) ((kj) this).field_L.a((byte) 51);
        if (param1 == 22) {
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (li) (Object) ((kj) this).field_L.b(-58);
                  continue L0;
                } else {
                  L2: {
                    if (param2 < var5.field_o) {
                      break L2;
                    } else {
                      if (param0 < var5.field_n) {
                        break L2;
                      } else {
                        if (var5.field_m + var5.field_o <= param2) {
                          break L2;
                        } else {
                          if (var5.field_n + var5.field_i < param0) {
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
        } else {
          return null;
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param2 != 1) {
            return;
        }
        ((kj) this).b(((eg) (Object) ((kj) this).field_w).a((rc) this, 6), param3, param0, 0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_N = "Unpacking graphics";
        field_J = new ff(10, 2, 2, 0);
    }
}
