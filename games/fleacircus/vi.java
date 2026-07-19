/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static String field_c;
    static int field_a;
    static String field_b;

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = fleas.field_A ? 1 : 0;
            var2 = 0;
            var3 = vg.field_z;
            if (-6 >= (var3 ^ -1)) {
              break L1;
            } else {
              var2 = var3 * (var3 * 8192) / 1100;
              if (var6 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if ((var3 ^ -1) > -106) {
              break L2;
            } else {
              if ((var3 ^ -1) <= -121) {
                break L0;
              } else {
                var3 = -var3 + 120;
                var2 = 8192 + -(var3 * var3 * 8192 / 3300);
                if (var6 == 0) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
          }
          var2 = (var3 * 16384 - 40960) / 220;
          break L0;
        }
        var4 = 1;
        if (!param1) {
          L3: {
            var5 = 0;
            if (3 == param0) {
              var4 = -1;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if ((param0 ^ -1) == -2) {
              var5 = 1;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if ((param0 ^ -1) != -5) {
              break L5;
            } else {
              var5 = 1;
              var4 = 1;
              break L5;
            }
          }
          L6: {
            if (5 == param0) {
              var4 = -1;
              var5 = 1;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (param0 != 6) {
              break L7;
            } else {
              var5 = -1;
              var4 = 1;
              break L7;
            }
          }
          if ((param0 ^ -1) != -8) {
            if ((param0 ^ -1) == -9) {
              L8: {
                var5 = -1;
                var4 = -1;
                if ((param0 ^ -1) != -12) {
                  break L8;
                } else {
                  var4 = -1;
                  break L8;
                }
              }
              L9: {
                if ((param0 ^ -1) != -13) {
                  break L9;
                } else {
                  var4 = -1;
                  var5 = -1;
                  break L9;
                }
              }
              L10: {
                if (13 == param0) {
                  var5 = -1;
                  var4 = 1;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (param0 == 14) {
                  var4 = -1;
                  var5 = 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if ((param0 ^ -1) == -16) {
                  var5 = 1;
                  var4 = 1;
                  break L12;
                } else {
                  break L12;
                }
              }
              nl.field_a = g.a((byte) -74, var2 * var5, var4 * var2);
              return;
            } else {
              L13: {
                if ((param0 ^ -1) != -12) {
                  break L13;
                } else {
                  var4 = -1;
                  break L13;
                }
              }
              L14: {
                if ((param0 ^ -1) != -13) {
                  break L14;
                } else {
                  var4 = -1;
                  var5 = -1;
                  break L14;
                }
              }
              L15: {
                if (13 == param0) {
                  var5 = -1;
                  var4 = 1;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (param0 == 14) {
                  var4 = -1;
                  var5 = 1;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if ((param0 ^ -1) == -16) {
                  var5 = 1;
                  var4 = 1;
                  break L17;
                } else {
                  break L17;
                }
              }
              nl.field_a = g.a((byte) -74, var2 * var5, var4 * var2);
              return;
            }
          } else {
            L18: {
              var5 = -1;
              var4 = -1;
              if ((param0 ^ -1) != -12) {
                break L18;
              } else {
                var4 = -1;
                break L18;
              }
            }
            L19: {
              if ((param0 ^ -1) != -13) {
                break L19;
              } else {
                var4 = -1;
                var5 = -1;
                break L19;
              }
            }
            L20: {
              if (13 == param0) {
                var5 = -1;
                var4 = 1;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (param0 == 14) {
                var4 = -1;
                var5 = 1;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if ((param0 ^ -1) == -16) {
                var5 = 1;
                var4 = 1;
                break L22;
              } else {
                break L22;
              }
            }
            nl.field_a = g.a((byte) -74, var2 * var5, var4 * var2);
            return;
          }
        } else {
          return;
        }
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = 0;
        if (!param2) {
          if (!param1) {
            var5 = 53 % ((param0 - 77) / 33);
            if (param3) {
              var4++;
              return ol.field_a[var4];
            } else {
              return ol.field_a[var4];
            }
          } else {
            var4 += 2;
            var5 = 53 % ((param0 - 77) / 33);
            if (param3) {
              var4++;
              return ol.field_a[var4];
            } else {
              return ol.field_a[var4];
            }
          }
        } else {
          var4 += 4;
          if (param1) {
            var4 += 2;
            var5 = 53 % ((param0 - 77) / 33);
            if (!param3) {
              return ol.field_a[var4];
            } else {
              var4++;
              return ol.field_a[var4];
            }
          } else {
            var5 = 53 % ((param0 - 77) / 33);
            if (param3) {
              var4++;
              return ol.field_a[var4];
            } else {
              return ol.field_a[var4];
            }
          }
        }
    }

    final static char a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = 76 / ((63 - param1) / 45);
        var2 = param0 & 255;
        if (-1 == (var2 ^ -1)) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        } else {
          if ((var2 ^ -1) <= -129) {
            if (-161 >= (var2 ^ -1)) {
              return (char)var2;
            } else {
              L0: {
                var4 = fh.field_e[var2 + -128];
                if (var4 == 0) {
                  var4 = 63;
                  break L0;
                } else {
                  break L0;
                }
              }
              var2 = var4;
              return (char)var2;
            }
          } else {
            return (char)var2;
          }
        }
    }

    final static String b(byte param0) {
        if (cb.field_v == wi.field_f) {
          return ag.field_e;
        } else {
          if (ui.field_kb == wi.field_f) {
            return li.field_d;
          } else {
            if (uc.field_c.a(param0 ^ 87)) {
              if (param0 != -55) {
                return (String) null;
              } else {
                return aa.field_s;
              }
            } else {
              return li.field_d;
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 <= 2) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void c(byte param0) {
        String discarded$0 = null;
        cg.a((byte) -105, 17);
        if (param0 >= -77) {
            discarded$0 = vi.b((byte) -17);
        }
    }

    static {
        field_a = -1;
        field_c = "Unpacking levels";
        field_b = null;
    }
}
