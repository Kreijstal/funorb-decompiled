/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static ka[] field_b;
    static wl field_a;
    static sl field_c;

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        if (param0 <= 49) {
          ve.a(34, 8, 89);
          if (0 != param1) {
            if (1 == param1) {
              var3 = nk.field_h;
              if (param2 * 7 >> 3 > var3) {
                L0: {
                  var4 = var3 % (param2 >> 3);
                  var5 = (param2 >> 3) + (var3 - var4);
                  var6 = -(param2 >> 3 << 3) + param2;
                  if (var6 >= param2 + -var5) {
                    var5 = param2;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (0 != param1) {
                  if (param1 == 1) {
                    nb.b(var5, -1);
                    return;
                  } else {
                    return;
                  }
                } else {
                  vk.a(var5, (byte) 106);
                  return;
                }
              } else {
                if (0 != param1) {
                  if (1 == param1) {
                    nb.b(param2, -1);
                    return;
                  } else {
                    return;
                  }
                } else {
                  vk.a(param2, (byte) 87);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            var3 = sh.field_r;
            if (param2 * 7 >> 3 > var3) {
              L1: {
                var4 = var3 % (param2 >> 3);
                var5 = (param2 >> 3) + (var3 - var4);
                var6 = -(param2 >> 3 << 3) + param2;
                if (var6 >= param2 + -var5) {
                  var5 = param2;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (0 != param1) {
                if (param1 == 1) {
                  nb.b(var5, -1);
                  return;
                } else {
                  return;
                }
              } else {
                vk.a(var5, (byte) 106);
                return;
              }
            } else {
              if (0 != param1) {
                if (1 == param1) {
                  nb.b(param2, -1);
                  return;
                } else {
                  return;
                }
              } else {
                vk.a(param2, (byte) 87);
                return;
              }
            }
          }
        } else {
          if (0 != param1) {
            if (1 == param1) {
              var3 = nk.field_h;
              if (param2 * 7 >> 3 > var3) {
                L2: {
                  var4 = var3 % (param2 >> 3);
                  var5 = (param2 >> 3) + (var3 - var4);
                  var6 = -(param2 >> 3 << 3) + param2;
                  if (var6 >= param2 + -var5) {
                    var5 = param2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (0 != param1) {
                  if (param1 != 1) {
                    return;
                  } else {
                    nb.b(var5, -1);
                    return;
                  }
                } else {
                  vk.a(var5, (byte) 106);
                  return;
                }
              } else {
                if (0 != param1) {
                  if (1 == param1) {
                    nb.b(param2, -1);
                    return;
                  } else {
                    return;
                  }
                } else {
                  vk.a(param2, (byte) 87);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            var3 = sh.field_r;
            if (param2 * 7 >> 3 > var3) {
              L3: {
                var4 = var3 % (param2 >> 3);
                var5 = (param2 >> 3) + (var3 - var4);
                var6 = -(param2 >> 3 << 3) + param2;
                if (var6 >= param2 + -var5) {
                  var5 = param2;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (0 != param1) {
                if (param1 != 1) {
                  return;
                } else {
                  nb.b(var5, -1);
                  return;
                }
              } else {
                vk.a(var5, (byte) 106);
                return;
              }
            } else {
              if (0 != param1) {
                if (1 == param1) {
                  nb.b(param2, -1);
                  return;
                } else {
                  return;
                }
              } else {
                vk.a(param2, (byte) 87);
                return;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        int var1 = 0;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new sl();
    }
}
