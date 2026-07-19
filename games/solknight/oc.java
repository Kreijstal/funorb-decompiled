/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    private da field_c;
    static java.awt.Frame field_a;
    private da field_b;
    static String field_e;
    private v field_d;

    final ba a(byte param0, int param1) {
        ba var3 = null;
        byte[] var4 = null;
        ba var5 = null;
        var3 = (ba) (this.field_d.a(0, (long)param1));
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            L1: {
              if ((param1 ^ -1) <= -32769) {
                break L1;
              } else {
                var4 = this.field_c.b(1, param0 + 12366, param1);
                if (!SolKnight.field_L) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = this.field_b.b(1, 12257, param1 & 32767);
            break L0;
          }
          var5 = new ba();
          if (param0 == -109) {
            if (var4 == null) {
              if (32768 <= param1) {
                var5.g(39);
                this.field_d.a(87, var5, (long)param1);
                return var5;
              } else {
                this.field_d.a(87, var5, (long)param1);
                return var5;
              }
            } else {
              var5.a(new gb(var4), false);
              if (32768 > param1) {
                this.field_d.a(87, var5, (long)param1);
                return var5;
              } else {
                var5.g(39);
                this.field_d.a(87, var5, (long)param1);
                return var5;
              }
            }
          } else {
            return (ba) null;
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 255) {
            field_e = (String) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static String a(boolean param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String stackIn_8_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_33_0 = null;
        String stackOut_22_0 = null;
        String stackOut_32_0 = null;
        String stackOut_7_0 = null;
        String stackOut_17_0 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        var6 = "(" + nf.field_U + " " + kl.field_b + " " + jg.field_e + ") " + ob.field_h;
        var1 = var6;
        if (!param0) {
          if ((te.field_O ^ -1) >= -1) {
            return var1;
          } else {
            var1 = var6 + ":";
            var2 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (te.field_O <= var2) {
                    break L2;
                  } else {
                    stackOut_22_0 = var1 + ' ';
                    stackIn_33_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      L3: {
                        L4: {
                          var14 = stackIn_23_0;
                          var3 = te.field_N.field_l[var2] & 255;
                          var4 = var3 >> -1918280092;
                          var3 = var3 & 15;
                          if (10 <= var4) {
                            break L4;
                          } else {
                            var4 += 48;
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var4 += 55;
                        break L3;
                      }
                      L5: {
                        L6: {
                          var15 = var14 + (char)var4;
                          if ((var3 ^ -1) <= -11) {
                            break L6;
                          } else {
                            var3 += 48;
                            if (var5 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var3 += 55;
                        break L5;
                      }
                      var1 = var15 + (char)var3;
                      var2++;
                      if (var5 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_32_0 = (String) (var1);
                stackIn_33_0 = stackOut_32_0;
                break L1;
              }
              return stackIn_33_0;
            }
          }
        } else {
          L7: {
            L8: {
              field_a = (java.awt.Frame) null;
              if ((te.field_O ^ -1) < -1) {
                var1 = var6 + ":";
                var2 = 0;
                L9: while (true) {
                  if (te.field_O > var2) {
                    stackOut_7_0 = var1 + ' ';
                    stackIn_18_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var5 != 0) {
                      break L7;
                    } else {
                      L10: {
                        L11: {
                          var12 = stackIn_8_0;
                          var3 = te.field_N.field_l[var2] & 255;
                          var4 = var3 >> -1918280092;
                          var3 = var3 & 15;
                          if (10 <= var4) {
                            break L11;
                          } else {
                            var4 += 48;
                            if (var5 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        var4 += 55;
                        break L10;
                      }
                      L12: {
                        L13: {
                          var13 = var12 + (char)var4;
                          if ((var3 ^ -1) <= -11) {
                            break L13;
                          } else {
                            var3 += 48;
                            if (var5 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        var3 += 55;
                        break L12;
                      }
                      var1 = var13 + (char)var3;
                      var2++;
                      if (var5 == 0) {
                        continue L9;
                      } else {
                        break L8;
                      }
                    }
                  } else {
                    return var1;
                  }
                }
              } else {
                break L8;
              }
            }
            stackOut_17_0 = (String) (var1);
            stackIn_18_0 = stackOut_17_0;
            break L7;
          }
          return stackIn_18_0;
        }
    }

    private oc() throws Throwable {
        throw new Error();
    }

    static {
        field_e = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
