/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends qa {
    char[] field_D;
    int[] field_x;
    boolean field_y;
    char[] field_r;
    static String field_v;
    static String field_C;
    static String field_z;
    static String field_w;
    static String field_u;
    int[] field_B;
    static String field_t;
    static String field_q;
    String field_s;
    static String field_A;

    final static String e(int param0) {
        String var1 = "";
        if (param0 != -24093) {
            return null;
        }
        if (null != b.field_c) {
            var1 = b.field_c.h(6728);
        }
        if (!(-1 != (var1.length() ^ -1))) {
            var1 = ki.a((byte) -127);
        }
        if (!((var1.length() ^ -1) != -1)) {
            var1 = hg.field_vb;
        }
        return var1;
    }

    private final void a(int param0, k param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        char[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        char[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        char[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        char[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        char[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        char[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        char[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        char[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        char[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        char[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        char[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        char[] stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        char[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        char stackOut_44_2 = 0;
        char[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        char[] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        char[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        char stackOut_38_2 = 0;
        char[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        char[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        char[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        char stackOut_19_2 = 0;
        char[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        char[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        char[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        char stackOut_13_2 = 0;
        char[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 < -9) {
          L0: {
            if (1 != param2) {
              L1: {
                if (-3 == (param2 ^ -1)) {
                  var4 = param1.g(31365);
                  ((ob) this).field_r = new char[var4];
                  ((ob) this).field_x = new int[var4];
                  var5 = 0;
                  L2: while (true) {
                    if ((var4 ^ -1) >= (var5 ^ -1)) {
                      break L1;
                    } else {
                      L3: {
                        ((ob) this).field_x[var5] = param1.d((byte) 69);
                        var6 = param1.d(-249699580);
                        stackOut_42_0 = ((ob) this).field_r;
                        stackOut_42_1 = var5;
                        stackIn_44_0 = stackOut_42_0;
                        stackIn_44_1 = stackOut_42_1;
                        stackIn_43_0 = stackOut_42_0;
                        stackIn_43_1 = stackOut_42_1;
                        if ((var6 ^ -1) != -1) {
                          stackOut_44_0 = (char[]) (Object) stackIn_44_0;
                          stackOut_44_1 = stackIn_44_1;
                          stackOut_44_2 = ob.a((byte) var6, -1);
                          stackIn_45_0 = stackOut_44_0;
                          stackIn_45_1 = stackOut_44_1;
                          stackIn_45_2 = stackOut_44_2;
                          break L3;
                        } else {
                          stackOut_43_0 = (char[]) (Object) stackIn_43_0;
                          stackOut_43_1 = stackIn_43_1;
                          stackOut_43_2 = 0;
                          stackIn_45_0 = stackOut_43_0;
                          stackIn_45_1 = stackOut_43_1;
                          stackIn_45_2 = stackOut_43_2;
                          break L3;
                        }
                      }
                      stackIn_45_0[stackIn_45_1] = (char) stackIn_45_2;
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (param2 == 3) {
                    var4 = param1.g(31365);
                    ((ob) this).field_D = new char[var4];
                    ((ob) this).field_B = new int[var4];
                    var5 = 0;
                    L4: while (true) {
                      if (var4 <= var5) {
                        break L1;
                      } else {
                        L5: {
                          ((ob) this).field_B[var5] = param1.d((byte) 69);
                          var6 = param1.d(-249699580);
                          stackOut_36_0 = ((ob) this).field_D;
                          stackOut_36_1 = var5;
                          stackIn_38_0 = stackOut_36_0;
                          stackIn_38_1 = stackOut_36_1;
                          stackIn_37_0 = stackOut_36_0;
                          stackIn_37_1 = stackOut_36_1;
                          if (0 != var6) {
                            stackOut_38_0 = (char[]) (Object) stackIn_38_0;
                            stackOut_38_1 = stackIn_38_1;
                            stackOut_38_2 = ob.a((byte) var6, -1);
                            stackIn_39_0 = stackOut_38_0;
                            stackIn_39_1 = stackOut_38_1;
                            stackIn_39_2 = stackOut_38_2;
                            break L5;
                          } else {
                            stackOut_37_0 = (char[]) (Object) stackIn_37_0;
                            stackOut_37_1 = stackIn_37_1;
                            stackOut_37_2 = 0;
                            stackIn_39_0 = stackOut_37_0;
                            stackIn_39_1 = stackOut_37_1;
                            stackIn_39_2 = stackOut_37_2;
                            break L5;
                          }
                        }
                        stackIn_39_0[stackIn_39_1] = (char) stackIn_39_2;
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    if ((param2 ^ -1) == -5) {
                      ((ob) this).field_y = true;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              break L0;
            } else {
              ((ob) this).field_s = param1.f((byte) -93);
              break L0;
            }
          }
          return;
        } else {
          ob.c((byte) 74);
          if (1 == param2) {
            ((ob) this).field_s = param1.f((byte) -93);
            return;
          } else {
            L6: {
              if (-3 == (param2 ^ -1)) {
                var4 = param1.g(31365);
                ((ob) this).field_r = new char[var4];
                ((ob) this).field_x = new int[var4];
                var5 = 0;
                L7: while (true) {
                  if ((var4 ^ -1) >= (var5 ^ -1)) {
                    break L6;
                  } else {
                    L8: {
                      ((ob) this).field_x[var5] = param1.d((byte) 69);
                      var6 = param1.d(-249699580);
                      stackOut_17_0 = ((ob) this).field_r;
                      stackOut_17_1 = var5;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      if ((var6 ^ -1) != -1) {
                        stackOut_19_0 = (char[]) (Object) stackIn_19_0;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = ob.a((byte) var6, -1);
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        break L8;
                      } else {
                        stackOut_18_0 = (char[]) (Object) stackIn_18_0;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = 0;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        break L8;
                      }
                    }
                    stackIn_20_0[stackIn_20_1] = (char) stackIn_20_2;
                    var5++;
                    continue L7;
                  }
                }
              } else {
                if (param2 == 3) {
                  var4 = param1.g(31365);
                  ((ob) this).field_D = new char[var4];
                  ((ob) this).field_B = new int[var4];
                  var5 = 0;
                  L9: while (true) {
                    if (var4 <= var5) {
                      break L6;
                    } else {
                      L10: {
                        ((ob) this).field_B[var5] = param1.d((byte) 69);
                        var6 = param1.d(-249699580);
                        stackOut_11_0 = ((ob) this).field_D;
                        stackOut_11_1 = var5;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (0 != var6) {
                          stackOut_13_0 = (char[]) (Object) stackIn_13_0;
                          stackOut_13_1 = stackIn_13_1;
                          stackOut_13_2 = ob.a((byte) var6, -1);
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          stackIn_14_2 = stackOut_13_2;
                          break L10;
                        } else {
                          stackOut_12_0 = (char[]) (Object) stackIn_12_0;
                          stackOut_12_1 = stackIn_12_1;
                          stackOut_12_2 = 0;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_14_2 = stackOut_12_2;
                          break L10;
                        }
                      }
                      stackIn_14_0[stackIn_14_1] = (char) stackIn_14_2;
                      var5++;
                      continue L9;
                    }
                  }
                } else {
                  if ((param2 ^ -1) == -5) {
                    ((ob) this).field_y = true;
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          }
        }
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null != ((ob) this).field_B) {
          var2 = 0;
          L0: while (true) {
            if (((ob) this).field_B.length <= var2) {
              if (((ob) this).field_x != null) {
                var4 = 0;
                var2 = var4;
                L1: while (true) {
                  if (((ob) this).field_x.length <= var4) {
                    if (param0 == -72) {
                      return;
                    } else {
                      char discarded$19 = ob.a((byte) -85, -72);
                      return;
                    }
                  } else {
                    ((ob) this).field_x[var4] = cr.b(((ob) this).field_x[var4], 32768);
                    var4++;
                    continue L1;
                  }
                }
              } else {
                if (param0 == -72) {
                  return;
                } else {
                  char discarded$20 = ob.a((byte) -85, -72);
                  return;
                }
              }
            } else {
              ((ob) this).field_B[var2] = cr.b(((ob) this).field_B[var2], 32768);
              var2++;
              continue L0;
            }
          }
        } else {
          if (((ob) this).field_x != null) {
            var4 = 0;
            var2 = var4;
            L2: while (true) {
              if (((ob) this).field_x.length > var4) {
                ((ob) this).field_x[var4] = cr.b(((ob) this).field_x[var4], 32768);
                var4++;
                continue L2;
              } else {
                L3: {
                  if (param0 == -72) {
                    break L3;
                  } else {
                    char discarded$21 = ob.a((byte) -85, -72);
                    break L3;
                  }
                }
                return;
              }
            }
          } else {
            if (param0 != -72) {
              char discarded$22 = ob.a((byte) -85, -72);
              return;
            } else {
              return;
            }
          }
        }
    }

    final static boolean d(byte param0) {
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 >= 3) {
          var1 = bl.a((byte) 55);
          var3 = -wn.field_r + var1;
          if ((var3 ^ -1L) >= -30001L) {
            var5 = 3000;
            if (-8 < (vd.field_c ^ -1)) {
              if ((vd.field_c ^ -1) > -6) {
                if (vd.field_c >= 3) {
                  var5 = 6000;
                  if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                    wn.field_r = var1;
                    vd.field_c = vd.field_c + 1;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                    wn.field_r = var1;
                    vd.field_c = vd.field_c + 1;
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                var5 = 9000;
                if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                  wn.field_r = var1;
                  vd.field_c = vd.field_c + 1;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              var5 = 12000;
              if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                wn.field_r = var1;
                vd.field_c = vd.field_c + 1;
                return true;
              } else {
                return false;
              }
            }
          } else {
            vd.field_c = 0;
            wn.field_r = var1;
            return true;
          }
        } else {
          String discarded$1 = ob.e(52);
          var1 = bl.a((byte) 55);
          var3 = -wn.field_r + var1;
          if ((var3 ^ -1L) >= -30001L) {
            var5 = 3000;
            if (-8 < (vd.field_c ^ -1)) {
              if ((vd.field_c ^ -1) > -6) {
                if (vd.field_c >= 3) {
                  var5 = 6000;
                  if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                    wn.field_r = var1;
                    vd.field_c = vd.field_c + 1;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                    wn.field_r = var1;
                    vd.field_c = vd.field_c + 1;
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                var5 = 9000;
                if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                  wn.field_r = var1;
                  vd.field_c = vd.field_c + 1;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              var5 = 12000;
              if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                wn.field_r = var1;
                vd.field_c = vd.field_c + 1;
                return true;
              } else {
                return false;
              }
            }
          } else {
            vd.field_c = 0;
            wn.field_r = var1;
            return true;
          }
        }
    }

    final void a(int param0, k param1) {
        int var3 = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        while (true) {
            var3 = param1.g(31365);
            if (0 == var3) {
                break;
            }
            this.a(-56, param1, var3);
        }
        var3 = -23 / ((param0 - 19) / 42);
    }

    final static char a(byte param0, int param1) {
        int var3 = 0;
        int var2 = param0 & 255;
        if (!(param1 != (var2 ^ -1))) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (-129 >= (var2 ^ -1)) {
            if (var2 >= 160) {
                return (char)var2;
            }
            var3 = vg.field_s[-128 + var2];
            if (!(var3 != 0)) {
                var3 = 63;
            }
            var2 = var3;
        }
        return (char)var2;
    }

    public static void c(byte param0) {
        field_A = null;
        field_C = null;
        field_t = null;
        if (param0 != -52) {
            ob.c((byte) -29);
            field_q = null;
            field_z = null;
            field_w = null;
            field_u = null;
            field_v = null;
            return;
        }
        field_q = null;
        field_z = null;
        field_w = null;
        field_u = null;
        field_v = null;
    }

    final static void a(cj param0, int param1) {
        cj var2 = null;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = (cj) (Object) param0.field_Cb.c(87);
        if (param1 < 30) {
          String discarded$1 = ob.e(34);
          L0: while (true) {
            if (var2 == null) {
              param0.field_I = 0;
              param0.field_Q = 0;
              param0.field_z = 0;
              param0.field_mb = 0;
              return;
            } else {
              var2.field_mb = 0;
              var2.field_z = 0;
              var2.field_I = 0;
              var2.field_Q = 0;
              var2 = (cj) (Object) param0.field_Cb.b(6);
              continue L0;
            }
          }
        } else {
          L1: while (true) {
            if (var2 == null) {
              param0.field_I = 0;
              param0.field_Q = 0;
              param0.field_z = 0;
              param0.field_mb = 0;
              return;
            } else {
              var2.field_mb = 0;
              var2.field_z = 0;
              var2.field_I = 0;
              var2.field_Q = 0;
              var2 = (cj) (Object) param0.field_Cb.b(6);
              continue L1;
            }
          }
        }
    }

    ob() {
        ((ob) this).field_y = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Your rating is <%0>";
        field_z = "Please enter your age in years";
        field_u = "Teleport";
        field_t = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_C = "??? points ";
        field_w = "to over <%0> great games";
        field_q = "x<%0>";
        field_A = "(Click or press 'SPACE' to close)";
    }
}
