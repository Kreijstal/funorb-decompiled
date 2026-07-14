/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qm {
    static int field_g;
    static int field_d;
    static String field_a;
    static boolean[] field_f;
    static int[] field_c;
    static String field_e;
    static int field_b;

    final static void a(km[] param0, int param1, int param2, int param3) {
        if (param1 >= -54) {
            Object var5 = null;
            qm.a((km[]) null, 95, 62, -2);
        }
        de.field_c = new le(param0);
        bb.field_b = param2;
        o.field_f = param3;
        fi.a((byte) 6);
    }

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        field_c = null;
        if (param0 != -6) {
            return;
        }
        field_a = null;
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
        ae var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = Chess.field_G;
          if (param1 instanceof ae) {
            var14 = (ae) (Object) param1;
            param1 = var14.field_g;
            var2 = var14.field_h + " | ";
            var11 = var2;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        var15 = new StringWriter();
        if (param0 == -89) {
          var4 = new PrintWriter((Writer) (Object) var15);
          param1.printStackTrace(var4);
          var4.close();
          var5 = var15.toString();
          var2 = var5;
          var11 = var5;
          var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
          var7 = var6.readLine();
          var2 = var7;
          var11 = var7;
          L1: while (true) {
            var8 = var6.readLine();
            var2 = var8;
            var11 = var8;
            var2 = var11;
            if (var8 != null) {
              L2: {
                var9 = var8.indexOf('(');
                var10 = var8.indexOf(')', 1 + var9);
                if (var9 == -1) {
                  var11 = var8;
                  var2 = var11;
                  var2 = var11;
                  break L2;
                } else {
                  var11 = var8.substring(0, var9);
                  break L2;
                }
              }
              L3: {
                var16 = var11.trim();
                var2 = var16;
                var2 = var16;
                var17 = var16.substring(1 + var16.lastIndexOf(' '));
                var2 = var17;
                var2 = var17;
                var18 = var17.substring(1 + var17.lastIndexOf('\t'));
                var2 = var18;
                var2 = var18;
                var19 = var2 + var18;
                var2 = var19;
                var2 = var19;
                if (0 == (var9 ^ -1)) {
                  break L3;
                } else {
                  if (-1 != var10) {
                    var12 = var8.indexOf(".java:", var9);
                    if (-1 < (var12 ^ -1)) {
                      break L3;
                    } else {
                      var2 = var19 + var8.substring(var12 - -5, var10);
                      break L3;
                    }
                  } else {
                    var2 = var2 + 32;
                    continue L1;
                  }
                }
              }
              var2 = var2 + 32;
              continue L1;
            } else {
              var2 = var11;
              var11 = var2;
              var2 = var11;
              var2 = var2 + "| " + var7;
              return var2;
            }
          }
        } else {
          return null;
        }
    }

    final static sa a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var6 = Chess.field_G;
        var2 = param1.length();
        if (var2 != 0) {
          if (var2 > 64) {
            return ok.field_Ob;
          } else {
            if (34 == param1.charAt(0)) {
              if (param1.charAt(-1 + var2) != 34) {
                return wh.field_b;
              } else {
                var3 = 0;
                var4 = 1;
                L0: while (true) {
                  if (var4 < var2 + -1) {
                    var5 = param1.charAt(var4);
                    if (var5 == 92) {
                      L1: {
                        if (var3 != 0) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          break L1;
                        } else {
                          stackOut_16_0 = 1;
                          stackIn_18_0 = stackOut_16_0;
                          break L1;
                        }
                      }
                      var3 = stackIn_18_0;
                      var4++;
                      continue L0;
                    } else {
                      L2: {
                        if (var5 != 34) {
                          break L2;
                        } else {
                          if (var3 != 0) {
                            break L2;
                          } else {
                            return wh.field_b;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              L3: {
                var3 = 0;
                var4 = 0;
                if (param0 == -24) {
                  break L3;
                } else {
                  var7 = null;
                  sa discarded$1 = qm.a((byte) 111, (String) null);
                  break L3;
                }
              }
              L4: while (true) {
                if (var4 < var2) {
                  var5 = param1.charAt(var4);
                  if (var5 != 46) {
                    if ((kh.field_m.indexOf(var5) ^ -1) == 0) {
                      return wh.field_b;
                    } else {
                      var3 = 0;
                      var4++;
                      continue L4;
                    }
                  } else {
                    L5: {
                      if (0 == var4) {
                        break L5;
                      } else {
                        if (-1 + var2 == var4) {
                          break L5;
                        } else {
                          if (var3 == 0) {
                            var3 = 1;
                            var4++;
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    return wh.field_b;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          return ef.field_j;
        }
    }

    final static String a(char param0, String param1, String param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Chess.field_G;
        var4 = param1.length();
        if (param3 == -51) {
          L0: {
            var5 = param2.length();
            var6 = var4;
            var7 = var5 + -1;
            if (0 == var7) {
              break L0;
            } else {
              var8_int = 0;
              L1: while (true) {
                var8_int = param1.indexOf((int) param0, var8_int);
                if (var8_int >= 0) {
                  var6 = var6 + var7;
                  var8_int++;
                  continue L1;
                } else {
                  break L0;
                }
              }
            }
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          L2: while (true) {
            var10 = param1.indexOf((int) param0, var9);
            if (-1 >= (var10 ^ -1)) {
              StringBuilder discarded$3 = var8.append(param1.substring(var9, var10));
              StringBuilder discarded$4 = var8.append(param2);
              var9 = 1 + var10;
              continue L2;
            } else {
              StringBuilder discarded$5 = var8.append(param1.substring(var9));
              return var8.toString();
            }
          }
        } else {
          return null;
        }
    }

    final static rk[] a(int param0, String param1, String param2, um param3) {
        int var4 = param3.a(param1, 0);
        if (param0 != 1) {
            return null;
        }
        int var5 = param3.a(param2, 7, var4);
        return om.a(param3, var4, true, var5);
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        var8 = Chess.field_G;
        if (param1 != null) {
          L0: {
            var3 = param1.length();
            if (var3 < 1) {
              break L0;
            } else {
              if (var3 > 12) {
                break L0;
              } else {
                var4 = ad.a(param1, -2);
                if (var4 == null) {
                  return false;
                } else {
                  if ((var4.length() ^ -1) <= -2) {
                    L1: {
                      if (cg.a(2, var4.charAt(0))) {
                        break L1;
                      } else {
                        if (!cg.a(2, var4.charAt(-1 + var4.length()))) {
                          var5 = 0;
                          if (param2 >= 79) {
                            var6 = 0;
                            L2: while (true) {
                              if (var6 >= param1.length()) {
                                L3: {
                                  if (var5 > 0) {
                                    stackOut_29_0 = 0;
                                    stackIn_30_0 = stackOut_29_0;
                                    break L3;
                                  } else {
                                    stackOut_28_0 = 1;
                                    stackIn_30_0 = stackOut_28_0;
                                    break L3;
                                  }
                                }
                                return stackIn_30_0 != 0;
                              } else {
                                L4: {
                                  var7 = param1.charAt(var6);
                                  if (cg.a(2, (char) var7)) {
                                    var5++;
                                    break L4;
                                  } else {
                                    var5 = 0;
                                    break L4;
                                  }
                                }
                                if (var5 >= 2) {
                                  if (!param0) {
                                    return false;
                                  } else {
                                    var6++;
                                    continue L2;
                                  }
                                } else {
                                  var6++;
                                  continue L2;
                                }
                              }
                            }
                          } else {
                            return true;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                    return false;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          return false;
        } else {
          return false;
        }
    }

    final static void a(int param0) {
        if (param0 < 70) {
            return;
        }
        if (hm.field_g) {
            return;
        }
        if (!(null != gf.field_d)) {
            gf.field_d = vc.a(-122, 4);
        }
        if (!(!gf.field_d.field_m)) {
            vk.field_b = vk.field_b & (gf.field_d.field_j ^ -1);
            wc.field_w = wc.field_w | gf.field_d.field_j;
            gf.field_d = null;
            hm.field_g = true;
        }
        if (hm.field_g) {
            dn.a(true);
            df.a((byte) 102);
            if (6 == jc.field_f) {
                if (vk.field_b == 0) {
                    jc.field_f = 0;
                    uk.a(qk.field_h, false, 28333, 0);
                }
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Previous";
        field_g = 0;
        field_e = "Reject";
        field_c = new int[8192];
        field_f = new boolean[]{true, true, true, true, true, true, true, true, true, true, -2 == (field_g ^ -1) ? true : false};
    }
}
