/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    static fe field_b;
    static rf field_d;
    static String field_c;
    static ci field_a;

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Transmogrify.field_A ? 1 : 0;
          if (param1 <= -72) {
            break L0;
          } else {
            l.a((byte) 92);
            break L0;
          }
        }
        L1: {
          L2: {
            var2 = 0;
            var3 = si.field_l;
            if (-6 < (var3 ^ -1)) {
              break L2;
            } else {
              L3: {
                if ((var3 ^ -1) <= -106) {
                  break L3;
                } else {
                  var2 = (16384 * var3 + -40960) / 220;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (var3 >= 120) {
                break L1;
              } else {
                var3 = -var3 + 120;
                var2 = -(8192 * (var3 * var3) / 3300) + 8192;
                if (var6 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          var2 = var3 * var3 * 8192 / 1100;
          break L1;
        }
        L4: {
          var4 = 1;
          var5 = 0;
          if (-2 == (param0 ^ -1)) {
            var5 = 1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if ((param0 ^ -1) != -4) {
            break L5;
          } else {
            var4 = -1;
            break L5;
          }
        }
        L6: {
          if (4 != param0) {
            break L6;
          } else {
            var5 = 1;
            var4 = 1;
            break L6;
          }
        }
        L7: {
          if ((param0 ^ -1) != -6) {
            break L7;
          } else {
            var4 = -1;
            var5 = 1;
            break L7;
          }
        }
        L8: {
          if ((param0 ^ -1) == -7) {
            var5 = -1;
            var4 = 1;
            break L8;
          } else {
            break L8;
          }
        }
        if (7 != param0) {
          if ((param0 ^ -1) == -9) {
            L9: {
              var5 = -1;
              var4 = -1;
              if (11 != param0) {
                break L9;
              } else {
                var4 = -1;
                break L9;
              }
            }
            L10: {
              if (12 == param0) {
                var5 = -1;
                var4 = -1;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (-14 != (param0 ^ -1)) {
                break L11;
              } else {
                var4 = 1;
                var5 = -1;
                break L11;
              }
            }
            L12: {
              if (14 == param0) {
                var5 = 1;
                var4 = -1;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if ((param0 ^ -1) != -16) {
                break L13;
              } else {
                var5 = 1;
                var4 = 1;
                break L13;
              }
            }
            qd.field_a = rc.a(var2 * var4, -110, var2 * var5);
            return;
          } else {
            L14: {
              if (11 != param0) {
                break L14;
              } else {
                var4 = -1;
                break L14;
              }
            }
            L15: {
              if (12 == param0) {
                var5 = -1;
                var4 = -1;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (-14 != (param0 ^ -1)) {
                break L16;
              } else {
                var4 = 1;
                var5 = -1;
                break L16;
              }
            }
            L17: {
              if (14 == param0) {
                var5 = 1;
                var4 = -1;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if ((param0 ^ -1) != -16) {
                break L18;
              } else {
                var5 = 1;
                var4 = 1;
                break L18;
              }
            }
            qd.field_a = rc.a(var2 * var4, -110, var2 * var5);
            return;
          }
        } else {
          L19: {
            var5 = -1;
            var4 = -1;
            if (11 != param0) {
              break L19;
            } else {
              var4 = -1;
              break L19;
            }
          }
          L20: {
            if (12 == param0) {
              var5 = -1;
              var4 = -1;
              break L20;
            } else {
              break L20;
            }
          }
          L21: {
            if (-14 != (param0 ^ -1)) {
              break L21;
            } else {
              var4 = 1;
              var5 = -1;
              break L21;
            }
          }
          L22: {
            if (14 == param0) {
              var5 = 1;
              var4 = -1;
              break L22;
            } else {
              break L22;
            }
          }
          L23: {
            if ((param0 ^ -1) != -16) {
              break L23;
            } else {
              var5 = 1;
              var4 = 1;
              break L23;
            }
          }
          qd.field_a = rc.a(var2 * var4, -110, var2 * var5);
          return;
        }
    }

    final static oh a(byte param0, int param1) {
        oh var2 = null;
        var2 = new oh();
        if (param0 != 12) {
          field_a = (ci) null;
          oc.field_G.a(var2, -103);
          re.a(param0 + -10, param1);
          return var2;
        } else {
          oc.field_G.a(var2, -103);
          re.a(param0 + -10, param1);
          return var2;
        }
    }

    public static void a(byte param0) {
        oh discarded$2 = null;
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 != 108) {
          discarded$2 = l.a((byte) -80, 25);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    static {
    }
}
