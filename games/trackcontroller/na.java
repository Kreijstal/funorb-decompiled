/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na {
    static int field_b;
    static String field_d;
    static qj field_c;
    static int field_e;
    private qj[] field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != -4775) {
            return;
        }
        field_d = null;
    }

    final static byte[] a(int param0, la param1, byte[] param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        var4 = param1.d(0, param3);
        if (var4 != 0) {
          if (param2 != null) {
            if (var4 == param2.length) {
              var5 = param1.d(0, 3);
              if (param0 != -26947) {
                field_b = -9;
                var6 = (byte)param1.d(param0 + 26947, 8);
                if (0 < var5) {
                  var7 = 0;
                  L0: while (true) {
                    if (var4 > var7) {
                      param2[var7] = (byte)(var6 + param1.d(0, var5));
                      var7++;
                      continue L0;
                    } else {
                      return param2;
                    }
                  }
                } else {
                  var7 = 0;
                  L1: while (true) {
                    if (var4 <= var7) {
                      return param2;
                    } else {
                      param2[var7] = (byte)var6;
                      var7++;
                      continue L1;
                    }
                  }
                }
              } else {
                L2: {
                  var6 = (byte)param1.d(param0 + 26947, 8);
                  if (0 >= var5) {
                    var7 = 0;
                    L3: while (true) {
                      if (var4 <= var7) {
                        break L2;
                      } else {
                        param2[var7] = (byte)var6;
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    var7 = 0;
                    L4: while (true) {
                      if (var4 <= var7) {
                        break L2;
                      } else {
                        param2[var7] = (byte)(var6 + param1.d(0, var5));
                        var7++;
                        continue L4;
                      }
                    }
                  }
                }
                return param2;
              }
            } else {
              L5: {
                param2 = new byte[var4];
                var5 = param1.d(0, 3);
                if (param0 == -26947) {
                  break L5;
                } else {
                  field_b = -9;
                  break L5;
                }
              }
              L6: {
                var6 = (byte)param1.d(param0 + 26947, 8);
                if (0 >= var5) {
                  var7 = 0;
                  L7: while (true) {
                    if (var4 <= var7) {
                      break L6;
                    } else {
                      param2[var7] = (byte)var6;
                      var7++;
                      continue L7;
                    }
                  }
                } else {
                  var7 = 0;
                  L8: while (true) {
                    if (var4 <= var7) {
                      break L6;
                    } else {
                      param2[var7] = (byte)(var6 + param1.d(0, var5));
                      var7++;
                      continue L8;
                    }
                  }
                }
              }
              return param2;
            }
          } else {
            L9: {
              param2 = new byte[var4];
              var5 = param1.d(0, 3);
              if (param0 == -26947) {
                break L9;
              } else {
                field_b = -9;
                break L9;
              }
            }
            L10: {
              var6 = (byte)param1.d(param0 + 26947, 8);
              if (0 >= var5) {
                var7 = 0;
                L11: while (true) {
                  if (var4 <= var7) {
                    break L10;
                  } else {
                    param2[var7] = (byte)var6;
                    var7++;
                    continue L11;
                  }
                }
              } else {
                var7 = 0;
                L12: while (true) {
                  if (var4 <= var7) {
                    break L10;
                  } else {
                    param2[var7] = (byte)(var6 + param1.d(0, var5));
                    var7++;
                    continue L12;
                  }
                }
              }
            }
            return param2;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        cl.a(((na) this).field_a, param1, param0, param2, param4, 4);
        int var6 = -101 / ((-65 - param3) / 57);
    }

    na(qj[] param0) {
        ((na) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -150;
        field_d = "Pause / Options";
    }
}
