/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class goa {
    static String field_c;
    private String field_a;
    private boolean field_b;

    final String a(int param0) {
        if (param0 != -12851) {
            field_c = null;
            return ((goa) this).field_a;
        }
        return ((goa) this).field_a;
    }

    goa(String param0) {
        this(param0, false);
    }

    final boolean a(byte param0) {
        if (param0 != 29) {
            return false;
        }
        return ((goa) this).field_b;
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 != 0) {
            Object var2 = null;
            byte[] discarded$0 = goa.a(107, -79, (kh) null, (byte[]) null);
        }
    }

    goa(String param0, boolean param1) {
        ((goa) this).field_a = param0;
        if (((goa) this).field_a == null) {
            ((goa) this).field_a = "";
        }
        ((goa) this).field_b = param1 ? true : false;
        if (((goa) this).field_a.length() == 0) {
            ((goa) this).field_b = false;
        }
    }

    final static byte[] a(int param0, int param1, kh param2, byte[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        var4 = param2.b((byte) 44, param0);
        if (param1 == -4854) {
          if (var4 != 0) {
            if (param3 != null) {
              if (var4 == param3.length) {
                L0: {
                  var5 = param2.b((byte) 44, 3);
                  var6 = (byte)param2.b((byte) 44, 8);
                  if (-1 > (var5 ^ -1)) {
                    var7 = 0;
                    L1: while (true) {
                      if (var4 <= var7) {
                        break L0;
                      } else {
                        param3[var7] = (byte)(param2.b((byte) 44, var5) + var6);
                        var7++;
                        continue L1;
                      }
                    }
                  } else {
                    var7 = 0;
                    L2: while (true) {
                      if (var4 <= var7) {
                        break L0;
                      } else {
                        param3[var7] = (byte)var6;
                        var7++;
                        continue L2;
                      }
                    }
                  }
                }
                return param3;
              } else {
                L3: {
                  param3 = new byte[var4];
                  var5 = param2.b((byte) 44, 3);
                  var6 = (byte)param2.b((byte) 44, 8);
                  if (-1 > (var5 ^ -1)) {
                    var7 = 0;
                    L4: while (true) {
                      if (var4 <= var7) {
                        break L3;
                      } else {
                        param3[var7] = (byte)(param2.b((byte) 44, var5) + var6);
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (var4 <= var7) {
                        break L3;
                      } else {
                        param3[var7] = (byte)var6;
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                return param3;
              }
            } else {
              L6: {
                param3 = new byte[var4];
                var5 = param2.b((byte) 44, 3);
                var6 = (byte)param2.b((byte) 44, 8);
                if (-1 > (var5 ^ -1)) {
                  var7 = 0;
                  L7: while (true) {
                    if (var4 <= var7) {
                      break L6;
                    } else {
                      param3[var7] = (byte)(param2.b((byte) 44, var5) + var6);
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
            return null;
          }
        } else {
          field_c = null;
          if (var4 != 0) {
            L9: {
              if (param3 == null) {
                param3 = new byte[var4];
                break L9;
              } else {
                if (var4 != param3.length) {
                  param3 = new byte[var4];
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            var5 = param2.b((byte) 44, 3);
            var6 = (byte)param2.b((byte) 44, 8);
            if (-1 > (var5 ^ -1)) {
              var7 = 0;
              L10: while (true) {
                if (var4 > var7) {
                  param3[var7] = (byte)(param2.b((byte) 44, var5) + var6);
                  var7++;
                  continue L10;
                } else {
                  return param3;
                }
              }
            } else {
              var7 = 0;
              L11: while (true) {
                if (var4 > var7) {
                  param3[var7] = (byte)var6;
                  var7++;
                  continue L11;
                } else {
                  return param3;
                }
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
        field_c = "Log in";
    }
}
