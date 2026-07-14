/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static String field_g;
    static String field_c;
    static boolean field_d;
    static String field_b;
    static String field_f;
    static String field_e;
    static byte[] field_a;

    final static boolean a(char param0, int param1) {
        Object var3 = null;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_18_0 = 0;
        if (param1 == -24380) {
          if (param0 < 65) {
            if (param0 >= 97) {
              if (122 >= param0) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            if (param0 > 90) {
              L0: {
                L1: {
                  if (param0 < 97) {
                    break L1;
                  } else {
                    if (122 < param0) {
                      break L1;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      break L0;
                    }
                  }
                }
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L0;
              }
              return stackIn_25_0 != 0;
            } else {
              stackOut_18_0 = 1;
              stackIn_20_0 = stackOut_18_0;
              return stackIn_20_0 != 0;
            }
          }
        } else {
          var3 = null;
          short[] discarded$5 = v.a((uf) null, true, (short[]) null, -23);
          if (param0 >= 65) {
            if (param0 > 90) {
              if (param0 >= 97) {
                if (122 < param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (param0 >= 97) {
              if (122 < param0) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static void b(int param0) {
        if (param0 != 0) {
            v.b(118);
            be.a((byte) 123, vk.field_a);
            return;
        }
        be.a((byte) 123, vk.field_a);
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        field_g = null;
        field_f = null;
        if (param0 != -66) {
          field_d = true;
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    final static short[] a(uf param0, boolean param1, short[] param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = client.field_A ? 1 : 0;
        if (param1) {
          var4 = param0.a(param3, (byte) 110);
          if (var4 != 0) {
            if (param2 != null) {
              if (param2.length == var4) {
                L0: {
                  var5 = param0.a(4, (byte) 123);
                  var6 = (short)param0.a(16, (byte) 46);
                  if (var5 > 0) {
                    var7 = 0;
                    L1: while (true) {
                      if (var4 <= var7) {
                        break L0;
                      } else {
                        param2[var7] = (short)(param0.a(var5, (byte) 99) + var6);
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
                        param2[var7] = (short)var6;
                        var7++;
                        continue L2;
                      }
                    }
                  }
                }
                return param2;
              } else {
                L3: {
                  param2 = new short[var4];
                  var5 = param0.a(4, (byte) 123);
                  var6 = (short)param0.a(16, (byte) 46);
                  if (var5 > 0) {
                    var7 = 0;
                    L4: while (true) {
                      if (var4 <= var7) {
                        break L3;
                      } else {
                        param2[var7] = (short)(param0.a(var5, (byte) 99) + var6);
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
                        param2[var7] = (short)var6;
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                return param2;
              }
            } else {
              L6: {
                param2 = new short[var4];
                var5 = param0.a(4, (byte) 123);
                var6 = (short)param0.a(16, (byte) 46);
                if (var5 > 0) {
                  var7 = 0;
                  L7: while (true) {
                    if (var4 <= var7) {
                      break L6;
                    } else {
                      param2[var7] = (short)(param0.a(var5, (byte) 99) + var6);
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
                      param2[var7] = (short)var6;
                      var7++;
                      continue L8;
                    }
                  }
                }
              }
              return param2;
            }
          } else {
            return null;
          }
        } else {
          boolean discarded$5 = v.a('', -20);
          var4 = param0.a(param3, (byte) 110);
          if (var4 != 0) {
            L9: {
              if (param2 == null) {
                param2 = new short[var4];
                break L9;
              } else {
                if (param2.length != var4) {
                  param2 = new short[var4];
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            var5 = param0.a(4, (byte) 123);
            var6 = (short)param0.a(16, (byte) 46);
            if (var5 > 0) {
              var7 = 0;
              L10: while (true) {
                if (var4 > var7) {
                  param2[var7] = (short)(param0.a(var5, (byte) 99) + var6);
                  var7++;
                  continue L10;
                } else {
                  return param2;
                }
              }
            } else {
              var7 = 0;
              L11: while (true) {
                if (var4 > var7) {
                  param2[var7] = (short)var6;
                  var7++;
                  continue L11;
                } else {
                  return param2;
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
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_g = "Email: ";
        field_b = "Unpacking music";
        field_d = true;
        field_f = "Resigned";
        field_e = "Mouse over an icon for details";
    }
}
