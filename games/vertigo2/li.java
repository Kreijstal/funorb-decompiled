/*
 * Decompiled by CFR-JS 0.4.0.
 */
class li {
    long field_k;
    li field_a;
    static int[] field_g;
    li field_c;
    static ej field_j;
    static int field_f;
    static co field_e;
    static String field_h;
    static String field_b;
    static fe[] field_i;
    static int field_d;
    static er field_m;
    static int[] field_l;

    public static void d(int param0) {
        field_e = null;
        field_h = null;
        field_i = null;
        field_b = null;
        field_l = null;
        field_j = null;
        field_g = null;
        field_m = null;
        if (param0 != 55) {
            li.d(-58);
        }
    }

    final static ve a(int param0, int param1) {
        ve[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        ve[] var5 = null;
        L0: {
          var4 = Vertigo2.field_L ? 1 : 0;
          if (param1 < -21) {
            break L0;
          } else {
            field_g = null;
            break L0;
          }
        }
        var5 = k.a(-15922);
        var2 = var5;
        var3 = 0;
        L1: while (true) {
          if (var3 < var5.length) {
            if (var5[var3].field_e == param0) {
              return var5[var3];
            } else {
              var3++;
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final boolean b(int param0) {
        if (param0 < 76) {
            ((li) this).field_a = null;
        }
        if (((li) this).field_a != null) {
            return true;
        }
        return false;
    }

    final static int a(int param0, boolean param1, CharSequence param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          if (param0 < 2) {
            break L0;
          } else {
            if (36 < param0) {
              break L0;
            } else {
              L1: {
                var4 = 0;
                var5 = 0;
                var6 = 0;
                if (param3) {
                  break L1;
                } else {
                  field_b = null;
                  break L1;
                }
              }
              var7 = param2.length();
              var8 = 0;
              L2: while (true) {
                if (var7 <= var8) {
                  if (var5 != 0) {
                    return var6;
                  } else {
                    throw new NumberFormatException();
                  }
                } else {
                  L3: {
                    var9 = param2.charAt(var8);
                    if (var8 == 0) {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        continue L2;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param1) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (48 > var9) {
                        break L5;
                      } else {
                        if (var9 > 57) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (var9 <= 122) {
                          var9 -= 87;
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (param0 > var9) {
                    L8: {
                      if (var4 == 0) {
                        break L8;
                      } else {
                        var9 = -var9;
                        break L8;
                      }
                    }
                    var10 = param0 * var6 - -var9;
                    if (var6 != var10 / param0) {
                      throw new NumberFormatException();
                    } else {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L2;
                    }
                  } else {
                    throw new NumberFormatException();
                  }
                }
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    final void c(int param0) {
        if (param0 != 2) {
            li.a(true, -15);
        }
        if (null == ((li) this).field_a) {
            return;
        }
        ((li) this).field_a.field_c = ((li) this).field_c;
        ((li) this).field_c.field_a = ((li) this).field_a;
        ((li) this).field_a = null;
        ((li) this).field_c = null;
    }

    final static void a(boolean param0, int param1) {
        ap.field_g = pn.field_Q[param1];
        eb.field_a = f.field_I[param1];
        bq.field_A = Vertigo2.field_H[param1];
        if (!param0) {
            field_d = 61;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new ej("email");
        field_b = "Your rating is <%0>";
        field_d = 0;
        field_f = 12;
        field_l = new int[256];
    }
}
