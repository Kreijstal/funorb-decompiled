/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    static vn[] field_c;
    static int[] field_d;
    static String[] field_a;
    static be field_b;

    final static void a(byte param0) {
        dk.field_ac = false;
        if (param0 <= 44) {
          sl.a((byte) 27);
        }
    }

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = ZombieDawn.field_J;
        var2 = 0;
        var3 = ej.field_x;
        if (5 > var3) {
          var2 = 8192 * (var3 * var3) / 1100;
          var4 = 1;
          var5 = 0;
          if (param1 == 1) {
            var5 = 1;
          }
          if (param1 == 3) {
            var4 = -1;
          }
          if (param1 == 4) {
            var5 = 1;
            var4 = 1;
          }
          if (param1 == 5) {
            var4 = -1;
            var5 = 1;
          }
          if (param1 == 6) {
            var5 = -1;
            var4 = 1;
          }
          if (param1 == 7 ||
            param1 == 8) {
            var5 = -1;
            var4 = -1;
          }
          if (param1 == 11) {
            var4 = -1;
          }
          if (param1 == 12) {
            var5 = -1;
            var4 = -1;
          }
          if (param1 == 13) {
            var4 = 1;
            var5 = -1;
          }
          if (14 == param1) {
            var5 = 1;
            var4 = -1;
          }
          if (!param0) {
            sl.a((byte) 45);
          }
          if (param1 == 15) {
            var4 = 1;
            var5 = 1;
          }
          jc.field_n = dl.a(0, var5 * var2, var2 * var4);
          return;
        }
        if (var3 < 105) {
          var2 = (-40960 + var3 * 16384) / 220;
          var4Lifetime1 = 1;
          var5Lifetime1 = 0;
          if (param1 == 1) {
            var5Lifetime1 = 1;
          }
          if (param1 == 3) {
            var4Lifetime1 = -1;
          }
          if (param1 == 4) {
            var5Lifetime1 = 1;
            var4Lifetime1 = 1;
          }
          if (param1 == 5) {
            var4Lifetime1 = -1;
            var5Lifetime1 = 1;
          }
          if (param1 == 6) {
            var5Lifetime1 = -1;
            var4Lifetime1 = 1;
          }
          if (param1 == 7) {
            var5Lifetime1 = -1;
            var4Lifetime1 = -1;
          } else {
            if (param1 == 8) {
              var5Lifetime1 = -1;
              var4Lifetime1 = -1;
            }
          }
          if (param1 == 11) {
            var4Lifetime1 = -1;
          }
          if (param1 == 12) {
            var5Lifetime1 = -1;
            var4Lifetime1 = -1;
          }
          if (param1 == 13) {
            var4Lifetime1 = 1;
            var5Lifetime1 = -1;
          }
          if (14 == param1) {
            var5Lifetime1 = 1;
            var4Lifetime1 = -1;
          }
          if (!param0) {
            sl.a((byte) 45);
          }
        } else {
          if (var3 < 120) {
            var3 = 120 - var3;
            var2 = -(8192 * (var3 * var3) / 3300) + 8192;
            var4Lifetime1 = 1;
            var5Lifetime1 = 0;
            if (param1 == 1) {
              var5Lifetime1 = 1;
            }
            if (param1 == 3) {
              var4Lifetime1 = -1;
            }
            if (param1 == 4) {
              var5Lifetime1 = 1;
              var4Lifetime1 = 1;
            }
            if (param1 == 5) {
              var4Lifetime1 = -1;
              var5Lifetime1 = 1;
            }
            if (param1 == 6) {
              var5Lifetime1 = -1;
              var4Lifetime1 = 1;
            }
            if (param1 == 7 ||
              param1 == 8) {
              var5Lifetime1 = -1;
              var4Lifetime1 = -1;
            }
            if (param1 == 11) {
              var4Lifetime1 = -1;
            }
            if (param1 == 12) {
              var5Lifetime1 = -1;
              var4Lifetime1 = -1;
            }
            if (param1 == 13) {
              var4Lifetime1 = 1;
              var5Lifetime1 = -1;
            }
            if (14 == param1) {
              var5Lifetime1 = 1;
              var4Lifetime1 = -1;
            }
            if (!param0) {
              sl.a((byte) 45);
            }
          } else {
            var4Lifetime1 = 1;
            var5Lifetime1 = 0;
            if (param1 == 1) {
              var5Lifetime1 = 1;
            }
            if (param1 == 3) {
              var4Lifetime1 = -1;
            }
            if (param1 == 4) {
              var5Lifetime1 = 1;
              var4Lifetime1 = 1;
            }
            if (param1 == 5) {
              var4Lifetime1 = -1;
              var5Lifetime1 = 1;
            }
            if (param1 == 6) {
              var5Lifetime1 = -1;
              var4Lifetime1 = 1;
            }
            if (param1 == 7) {
              var5Lifetime1 = -1;
              var4Lifetime1 = -1;
              if (param1 == 11) {
                var4Lifetime1 = -1;
              }
              if (param1 == 12) {
                var5Lifetime1 = -1;
                var4Lifetime1 = -1;
              }
              if (param1 == 13) {
                var4Lifetime1 = 1;
                var5Lifetime1 = -1;
              }
              if (14 == param1) {
                var5Lifetime1 = 1;
                var4Lifetime1 = -1;
              }
              if (!param0) {
                sl.a((byte) 45);
              }
            } else {
              if (param1 == 8) {
                var5Lifetime1 = -1;
                var4Lifetime1 = -1;
                if (param1 == 11) {
                  var4Lifetime1 = -1;
                }
                if (param1 == 12) {
                  var5Lifetime1 = -1;
                  var4Lifetime1 = -1;
                }
                if (param1 == 13) {
                  var4Lifetime1 = 1;
                  var5Lifetime1 = -1;
                }
                if (14 == param1) {
                  var5Lifetime1 = 1;
                  var4Lifetime1 = -1;
                }
                if (!param0) {
                  sl.a((byte) 45);
                }
              } else {
                if (param1 == 11) {
                  var4Lifetime1 = -1;
                }
                if (param1 == 12) {
                  var5Lifetime1 = -1;
                  var4Lifetime1 = -1;
                }
                if (param1 == 13) {
                  var4Lifetime1 = 1;
                  var5Lifetime1 = -1;
                }
                if (14 == param1) {
                  var5Lifetime1 = 1;
                  var4Lifetime1 = -1;
                }
                if (!param0) {
                  sl.a((byte) 45);
                }
              }
            }
          }
        }
        if (param1 == 15) {
          var4Lifetime1 = 1;
          var5Lifetime1 = 1;
        }
        jc.field_n = dl.a(0, var5Lifetime1 * var2, var2 * var4Lifetime1);
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 <= 45) {
          sl.a((byte) 63);
        }
    }

    static {
        field_a = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
