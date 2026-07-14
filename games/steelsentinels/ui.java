/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends ug {
    static gk[] field_V;
    int field_R;
    static boolean field_T;
    static u field_U;
    static String field_W;
    static String field_S;
    static boolean field_G;

    public static void h(int param0) {
        Object var2 = null;
        field_U = null;
        field_V = null;
        if (param0 != -13) {
          var2 = null;
          String discarded$2 = ui.a(20, (CharSequence) null);
          field_W = null;
          field_S = null;
          return;
        } else {
          field_W = null;
          field_S = null;
          return;
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        StringBuilder var10 = null;
        StringBuilder var11 = null;
        var9 = SteelSentinels.field_G;
        if (param1 != null) {
          var2 = 0;
          var3 = param1.length();
          L0: while (true) {
            if (var3 > var2) {
              if (jd.a(param1.charAt(var2), -33)) {
                var2++;
                continue L0;
              } else {
                L1: while (true) {
                  L2: {
                    if (var2 >= var3) {
                      break L2;
                    } else {
                      if (!jd.a(param1.charAt(-1 + var3), -33)) {
                        break L2;
                      } else {
                        var3--;
                        continue L1;
                      }
                    }
                  }
                  var4 = var3 - var2;
                  if (var4 >= param0) {
                    if ((var4 ^ -1) >= -13) {
                      L3: {
                        var11 = new StringBuilder(var4);
                        var6 = var2;
                        if (var3 <= var6) {
                          break L3;
                        } else {
                          L4: {
                            var7 = param1.charAt(var6);
                            if (!qh.a((byte) -30, (char) var7)) {
                              var6++;
                              break L4;
                            } else {
                              L5: {
                                var8 = sg.a((byte) 115, (char) var7);
                                if (var8 == 0) {
                                  var6++;
                                  break L5;
                                } else {
                                  StringBuilder discarded$2 = var11.append(var8);
                                  break L5;
                                }
                              }
                              var6++;
                              break L4;
                            }
                          }
                          var6++;
                          var6++;
                          var6++;
                          var6++;
                          break L3;
                        }
                      }
                      if (0 == var11.length()) {
                        return null;
                      } else {
                        return var11.toString();
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
              L6: while (true) {
                L7: {
                  if (var2 >= var3) {
                    break L7;
                  } else {
                    if (!jd.a(param1.charAt(-1 + var3), -33)) {
                      break L7;
                    } else {
                      var3--;
                      continue L6;
                    }
                  }
                }
                var4 = var3 - var2;
                if (var4 >= param0) {
                  if ((var4 ^ -1) >= -13) {
                    L8: {
                      var10 = new StringBuilder(var4);
                      var6 = var2;
                      if (var3 <= var6) {
                        break L8;
                      } else {
                        L9: {
                          var7 = param1.charAt(var6);
                          if (!qh.a((byte) -30, (char) var7)) {
                            var6++;
                            break L9;
                          } else {
                            L10: {
                              var8 = sg.a((byte) 115, (char) var7);
                              if (var8 == 0) {
                                var6++;
                                break L10;
                              } else {
                                StringBuilder discarded$3 = var10.append(var8);
                                break L10;
                              }
                            }
                            var6++;
                            break L9;
                          }
                        }
                        var6++;
                        var6++;
                        var6++;
                        var6++;
                        break L8;
                      }
                    }
                    if (0 == var10.length()) {
                      return null;
                    } else {
                      return var10.toString();
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    ui(lh param0) {
        super(param0.field_o, param0.field_z, param0.field_x, param0.field_E, (qk) null, (tn) null);
        param0.a(0, (byte) -101, 0, ((ui) this).field_x, ((ui) this).field_E);
        ((ui) this).field_J = param0;
        ((ui) this).field_R = 256;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        wk var6 = null;
        if (-1 == (param3 ^ -1)) {
          if (((ui) this).field_J != null) {
            if (0 != ((ui) this).field_R) {
              if ((((ui) this).field_R ^ -1) == -257) {
                ((ui) this).field_J.a(param0 - -((ui) this).field_z, (byte) -117, param2 - -((ui) this).field_o, param3);
                return;
              } else {
                var6 = new wk(((ui) this).field_J.field_x, ((ui) this).field_J.field_E);
                if (param1 > -99) {
                  return;
                } else {
                  q.a(var6, (byte) -90);
                  ((ui) this).field_J.a(0, (byte) -128, 0, param3);
                  tk.f((byte) 114);
                  var6.b(((ui) this).field_o + param2, ((ui) this).field_z + param0, ((ui) this).field_R);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static int a(boolean param0) {
        if (param0) {
            return -12;
        }
        return al.field_d;
    }

    final static void a(int param0, int param1) {
        kj var2 = mm.field_g;
        var2.a(param0, (byte) -117);
        var2.a((byte) 111, 1);
        var2.a((byte) 119, param1);
    }

    public ui() {
        super(0, 0, 0, 0, (qk) null, (tn) null);
        ((ui) this).field_R = 256;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = "<%0> is not on your ignore list.";
        field_S = "<%0>:<%1><%2>";
        field_G = false;
    }
}
