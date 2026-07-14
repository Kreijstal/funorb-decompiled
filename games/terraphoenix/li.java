/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static String field_b;
    static boolean field_a;

    final static void a(int param0, String[] param1, int param2, int param3, int param4, java.applet.Applet param5) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Terraphoenix.field_V;
          df.field_L = param5.getParameter("overxgames");
          if (null == df.field_L) {
            df.field_L = "0";
            break L0;
          } else {
            break L0;
          }
        }
        fi.field_o = param5.getParameter("overxachievements");
        if (fi.field_o != null) {
          var6 = param5.getParameter("currency");
          if (var6 == null) {
            L1: {
              ej.field_S = 2;
              me.field_k = param4;
              da.field_b = param2;
              dh.field_h = param3;
              if (param0 == 22957) {
                wg.field_l = new ci[param1.length];
                var7 = 0;
                break L1;
              } else {
                field_a = true;
                wg.field_l = new ci[param1.length];
                var7 = 0;
                break L1;
              }
            }
            L2: while (true) {
              if (param1.length <= var7) {
                vi.field_j = param1;
                return;
              } else {
                wg.field_l[var7] = new ci(317, 34);
                var7++;
                continue L2;
              }
            }
          } else {
            if (te.a((CharSequence) (Object) var6, true)) {
              L3: {
                ej.field_S = ta.a((CharSequence) (Object) var6, -121);
                me.field_k = param4;
                da.field_b = param2;
                dh.field_h = param3;
                if (param0 == 22957) {
                  wg.field_l = new ci[param1.length];
                  var7 = 0;
                  break L3;
                } else {
                  field_a = true;
                  wg.field_l = new ci[param1.length];
                  var7 = 0;
                  break L3;
                }
              }
              L4: while (true) {
                if (param1.length <= var7) {
                  vi.field_j = param1;
                  return;
                } else {
                  wg.field_l[var7] = new ci(317, 34);
                  var7++;
                  continue L4;
                }
              }
            } else {
              L5: {
                ej.field_S = 2;
                me.field_k = param4;
                da.field_b = param2;
                dh.field_h = param3;
                if (param0 == 22957) {
                  wg.field_l = new ci[param1.length];
                  var7 = 0;
                  break L5;
                } else {
                  field_a = true;
                  wg.field_l = new ci[param1.length];
                  var7 = 0;
                  break L5;
                }
              }
              L6: while (true) {
                if (param1.length <= var7) {
                  vi.field_j = param1;
                  return;
                } else {
                  wg.field_l[var7] = new ci(317, 34);
                  var7++;
                  continue L6;
                }
              }
            }
          }
        } else {
          L7: {
            fi.field_o = "0";
            var6 = param5.getParameter("currency");
            if (var6 == null) {
              ej.field_S = 2;
              break L7;
            } else {
              if (te.a((CharSequence) (Object) var6, true)) {
                ej.field_S = ta.a((CharSequence) (Object) var6, -121);
                break L7;
              } else {
                ej.field_S = 2;
                break L7;
              }
            }
          }
          L8: {
            me.field_k = param4;
            da.field_b = param2;
            dh.field_h = param3;
            if (param0 == 22957) {
              wg.field_l = new ci[param1.length];
              var7 = 0;
              break L8;
            } else {
              field_a = true;
              wg.field_l = new ci[param1.length];
              var7 = 0;
              break L8;
            }
          }
          L9: while (true) {
            if (param1.length <= var7) {
              vi.field_j = param1;
              return;
            } else {
              wg.field_l[var7] = new ci(317, 34);
              var7++;
              continue L9;
            }
          }
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2 = param1.length;
        byte[] var3 = new byte[var2];
        ka.a(param1, param0, var3, 0, var2);
        return var3;
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        String var10 = null;
        String var11 = null;
        var8 = Terraphoenix.field_V;
        if (param1 == null) {
          return false;
        } else {
          var3 = param1.length();
          if (var3 < 1) {
            return false;
          } else {
            if (12 >= var3) {
              if (param2 == 18116) {
                L0: {
                  var11 = hm.a((byte) 6, param1);
                  if (var11 == null) {
                    break L0;
                  } else {
                    if (-2 < (var11.length() ^ -1)) {
                      break L0;
                    } else {
                      if (ad.a((byte) 120, var11.charAt(0))) {
                        return false;
                      } else {
                        if (!ad.a((byte) 117, var11.charAt(var11.length() - 1))) {
                          var5 = 0;
                          var6 = 0;
                          L1: while (true) {
                            if (param1.length() <= var6) {
                              if ((var5 ^ -1) >= -1) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              L2: {
                                var7 = param1.charAt(var6);
                                if (ad.a((byte) 88, (char) var7)) {
                                  var5++;
                                  break L2;
                                } else {
                                  var5 = 0;
                                  break L2;
                                }
                              }
                              L3: {
                                if ((var5 ^ -1) > -3) {
                                  var6++;
                                  break L3;
                                } else {
                                  if (param0) {
                                    break L3;
                                  } else {
                                    return false;
                                  }
                                }
                              }
                              var6++;
                              continue L1;
                            }
                          }
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
                return false;
              } else {
                var9 = null;
                boolean discarded$1 = li.a(true, (CharSequence) null, 20);
                var10 = hm.a((byte) 6, param1);
                if (var10 != null) {
                  if (-2 >= (var10.length() ^ -1)) {
                    if (ad.a((byte) 120, var10.charAt(0))) {
                      return false;
                    } else {
                      if (!ad.a((byte) 117, var10.charAt(var10.length() - 1))) {
                        var5 = 0;
                        var6 = 0;
                        L4: while (true) {
                          if (param1.length() <= var6) {
                            if ((var5 ^ -1) >= -1) {
                              return true;
                            } else {
                              return false;
                            }
                          } else {
                            L5: {
                              var7 = param1.charAt(var6);
                              if (ad.a((byte) 88, (char) var7)) {
                                var5++;
                                break L5;
                              } else {
                                var5 = 0;
                                break L5;
                              }
                            }
                            L6: {
                              if ((var5 ^ -1) > -3) {
                                var6++;
                                break L6;
                              } else {
                                if (param0) {
                                  break L6;
                                } else {
                                  return false;
                                }
                              }
                            }
                            var6++;
                            continue L4;
                          }
                        }
                      } else {
                        return false;
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param0 >> -544863536;
        int var4 = param0 & 65535;
        if (param1 > -114) {
            return 76;
        }
        int var5 = param2 >> -394132240;
        int var6 = 65535 & param2;
        return var5 * var4 + var3 * param2 + (var6 * var4 >> 1164291696);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -394132240) {
            int discarded$0 = li.a(83, 64, 84);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Loading extra data";
        field_a = false;
    }
}
