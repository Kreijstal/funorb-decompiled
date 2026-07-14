/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static String field_a;
    static of field_b;
    static String field_c;

    final static java.applet.Applet a(int param0) {
        if (param0 != 0) {
            hc.a((byte) -61);
            if (null != bh.field_i) {
                return bh.field_i;
            }
            return (java.applet.Applet) (Object) nh.field_J;
        }
        if (null != bh.field_i) {
            return bh.field_i;
        }
        return (java.applet.Applet) (Object) nh.field_J;
    }

    final static String a(boolean param0) {
        if (param0) {
          if (df.field_h) {
            return md.field_qb[0];
          } else {
            return md.field_qb[1];
          }
        } else {
          field_c = null;
          if (df.field_h) {
            return md.field_qb[0];
          } else {
            return md.field_qb[1];
          }
        }
    }

    final static byte[] a(int param0, am param1, byte param2, byte[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        var4 = param1.k(80, param0);
        if (var4 != 0) {
          if (param3 != null) {
            if (var4 == param3.length) {
              var5 = param1.k(95, 3);
              if (param2 > -24) {
                field_c = null;
                var6 = (byte)param1.k(85, 8);
                if ((var5 ^ -1) >= -1) {
                  var7 = 0;
                  L0: while (true) {
                    if (var4 > var7) {
                      param3[var7] = (byte)var6;
                      var7++;
                      continue L0;
                    } else {
                      return param3;
                    }
                  }
                } else {
                  var7 = 0;
                  L1: while (true) {
                    if (var4 <= var7) {
                      return param3;
                    } else {
                      param3[var7] = (byte)(param1.k(56, var5) + var6);
                      var7++;
                      continue L1;
                    }
                  }
                }
              } else {
                L2: {
                  var6 = (byte)param1.k(85, 8);
                  if ((var5 ^ -1) < -1) {
                    var7 = 0;
                    L3: while (true) {
                      if (var4 <= var7) {
                        break L2;
                      } else {
                        param3[var7] = (byte)(param1.k(56, var5) + var6);
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
                        param3[var7] = (byte)var6;
                        var7++;
                        continue L4;
                      }
                    }
                  }
                }
                return param3;
              }
            } else {
              L5: {
                param3 = new byte[var4];
                var5 = param1.k(95, 3);
                if (param2 <= -24) {
                  break L5;
                } else {
                  field_c = null;
                  break L5;
                }
              }
              L6: {
                var6 = (byte)param1.k(85, 8);
                if ((var5 ^ -1) < -1) {
                  var7 = 0;
                  L7: while (true) {
                    if (var4 <= var7) {
                      break L6;
                    } else {
                      param3[var7] = (byte)(param1.k(56, var5) + var6);
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
                      param3[var7] = (byte)var6;
                      var7++;
                      continue L8;
                    }
                  }
                }
              }
              return param3;
            }
          } else {
            L9: {
              param3 = new byte[var4];
              var5 = param1.k(95, 3);
              if (param2 <= -24) {
                break L9;
              } else {
                field_c = null;
                break L9;
              }
            }
            L10: {
              var6 = (byte)param1.k(85, 8);
              if ((var5 ^ -1) < -1) {
                var7 = 0;
                L11: while (true) {
                  if (var4 <= var7) {
                    break L10;
                  } else {
                    param3[var7] = (byte)(param1.k(56, var5) + var6);
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
                    param3[var7] = (byte)var6;
                    var7++;
                    continue L12;
                  }
                }
              }
            }
            return param3;
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 > -114) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Click anywhere to activate!";
        field_c = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
