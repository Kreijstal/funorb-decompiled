/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    private vd field_c;
    static String field_a;
    private gn[] field_d;
    private gn field_e;
    static String field_b;

    final boolean g(int param0) {
        gn[] var2 = null;
        int var3 = 0;
        gn var4 = null;
        int var5 = 0;
        gn[] var6 = null;
        L0: {
          var5 = EscapeVector.field_A;
          if (param0 == -9949) {
            break L0;
          } else {
            ((kg) this).field_c = null;
            break L0;
          }
        }
        if (((kg) this).a(-19836)) {
          return true;
        } else {
          ((kg) this).field_c.b(104);
          var6 = ((kg) this).field_d;
          var2 = var6;
          var3 = 0;
          L1: while (true) {
            if (var3 >= var6.length) {
              L2: {
                if (((kg) this).field_e == null) {
                  break L2;
                } else {
                  ((kg) this).field_e.c(5);
                  break L2;
                }
              }
              return ((kg) this).a(param0 + -9887);
            } else {
              var4 = var6[var3];
              if (var4 != null) {
                var4.c(5);
                var3++;
                continue L1;
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    public static void f(int param0) {
        field_a = null;
        int var1 = 91 % ((param0 - -58) / 38);
        field_b = null;
    }

    final int a(boolean param0, int param1, int param2) {
        gn[] var4 = null;
        int var5 = 0;
        gn var6 = null;
        int var7 = 0;
        gn[] var8 = null;
        var7 = EscapeVector.field_A;
        if (null != ((kg) this).field_d) {
          var8 = ((kg) this).field_d;
          var4 = var8;
          if (param0) {
            var5 = 0;
            L0: while (true) {
              if (var5 >= var8.length) {
                return -1;
              } else {
                var6 = var8[var5];
                if (var6 != null) {
                  if (var6.field_j == param1) {
                    return var6.b(param2, 80);
                  } else {
                    var5++;
                    continue L0;
                  }
                } else {
                  var5++;
                  continue L0;
                }
              }
            }
          } else {
            return 3;
          }
        } else {
          return -1;
        }
    }

    final boolean c(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var7 = EscapeVector.field_A;
        if (!(null != ((kg) this).field_e)) {
            return false;
        }
        if (param0 < 110) {
            return false;
        }
        int var2 = ((kg) this).field_e.field_j;
        int var3 = je.a(false, var2);
        if ((var3 ^ -1) >= -1) {
            return false;
        }
        for (var4 = 0; var3 > var4; var4++) {
            var5 = ((kg) this).field_e.b(var4, 74);
            if (!(nl.a((byte) 111, var5))) {
                return false;
            }
        }
        return true;
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != -22357) {
            int discarded$0 = ((kg) this).a(-119, 57);
        }
        ((kg) this).field_c.a(param0, param1, true);
    }

    final boolean a(int param0, boolean param1) {
        int var4 = 0;
        int var5 = 0;
        int var7 = EscapeVector.field_A;
        int var3 = je.a(param1, param0);
        if (!(0 < var3)) {
            return false;
        }
        for (var4 = 0; var4 < var3; var4++) {
            var5 = ((kg) this).a(true, param0, var4);
            if (!nl.a((byte) 98, var5)) {
                return false;
            }
        }
        return true;
    }

    final boolean e(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((kg) this).e(45);
        }
        return ((kg) this).field_c.d((byte) -83);
    }

    final int b(int param0, int param1) {
        gn[] var3 = null;
        int var4 = 0;
        gn var5 = null;
        int var6 = 0;
        var6 = EscapeVector.field_A;
        if (null != ((kg) this).field_d) {
          var3 = ((kg) this).field_d;
          var4 = param1;
          L0: while (true) {
            if (var4 >= var3.length) {
              return -1;
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                if (param0 == var5.field_j) {
                  return var5.field_d;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return -1;
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        gn var5 = null;
        int var6 = 0;
        int var7 = 0;
        gn[] var8 = null;
        var7 = EscapeVector.field_A;
        if (((kg) this).field_d == null) {
          return 0;
        } else {
          L0: {
            if (param0 == 29386) {
              break L0;
            } else {
              ((kg) this).field_e = null;
              break L0;
            }
          }
          var8 = ((kg) this).field_d;
          var4 = 0;
          L1: while (true) {
            if (var8.length <= var4) {
              return 0;
            } else {
              var5 = var8[var4];
              if (var5 != null) {
                if (param1 == var5.field_j) {
                  if (0 != var5.field_d) {
                    if (-2 == (var5.field_d ^ -1)) {
                      var6 = je.a(false, param1);
                      if (0 >= var6) {
                        return 0;
                      } else {
                        return var6;
                      }
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    if (var5.field_n <= 0) {
                      return 0;
                    } else {
                      return var5.field_n;
                    }
                  }
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                var4++;
                continue L1;
              }
            }
          }
        }
    }

    final static boolean a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = -43 / ((param0 - -62) / 32);
            var3 = 14;
            var4 = var3 - -3;
            if (param1 < var3) {
              break L1;
            } else {
              if (var4 <= param1) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final void a(byte param0, int param1, int[] param2, int param3) {
        if (param2 != null) {
            if (!((param2.length ^ -1) == -5)) {
                return;
            }
            if (!(null != ((kg) this).field_e)) {
                return;
            }
            if (((kg) this).field_e.field_j != param1) {
                return;
            }
            ((kg) this).field_e.a((byte) -15, param3, param2);
            if (param0 != -64) {
                ((kg) this).field_d = null;
            }
            return;
        }
    }

    final void a(int param0, int param1, int param2, int[] param3) {
        gn[] var5 = null;
        int var6 = 0;
        gn var7 = null;
        int var8 = 0;
        var8 = EscapeVector.field_A;
        if (param3 == null) {
          return;
        } else {
          if (param3.length == 4) {
            if (((kg) this).field_d != null) {
              if (param0 == -15748) {
                var5 = ((kg) this).field_d;
                var6 = 0;
                L0: while (true) {
                  if (var5.length <= var6) {
                    return;
                  } else {
                    var7 = var5[var6];
                    if (var7 != null) {
                      if (param1 == var7.field_j) {
                        var7.a((byte) -15, param2, param3);
                        var6++;
                        continue L0;
                      } else {
                        var6++;
                        continue L0;
                      }
                    } else {
                      var6++;
                      continue L0;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final void b(int param0) {
        int var2 = 0;
        gn[] var3 = null;
        int var4 = 0;
        gn var5 = null;
        int var6 = 0;
        var6 = EscapeVector.field_A;
        if (((kg) this).field_d == null) {
          return;
        } else {
          var2 = 127 % ((67 - param0) / 42);
          var3 = ((kg) this).field_d;
          var4 = 0;
          L0: while (true) {
            if (var3.length <= var4) {
              L1: {
                if (null != ((kg) this).field_e) {
                  ((kg) this).field_e.b(7108);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                var5.b(7108);
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final boolean d(int param0) {
        gn[] var2 = null;
        int var3 = 0;
        gn var4 = null;
        int var5 = 0;
        gn[] var6 = null;
        var5 = EscapeVector.field_A;
        if (null == ((kg) this).field_d) {
          return false;
        } else {
          var6 = ((kg) this).field_d;
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var6.length) {
              if (param0 == 17523) {
                return false;
              } else {
                ((kg) this).field_d = null;
                return false;
              }
            } else {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.a(false)) {
                  return true;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    kg() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ((kg) this).field_c = new vd();
        int var1 = 4;
        ((kg) this).field_d = new gn[var1];
        for (var2 = 0; var1 > var2; var2++) {
            var3 = pc.field_f[var2];
            var4 = -1;
            if ((var3 ^ -1) == -2) {
                var4 = 1;
            }
            var5 = fl.field_m[var2];
            var6 = (nk.a(1, var2) ^ -1) == -3 ? 1 : 0;
            ((kg) this).field_d[var2] = new gn(var2, var3, var4, var5, var6 != 0, (kg) this);
        }
        var2 = 2;
        var3 = 1;
        var4 = 0;
        var5 = 1;
        var6 = 1;
        ((kg) this).field_e = new gn(var2, var3, var4, var5, var6 != 0, (kg) this);
    }

    final boolean a(int param0, boolean param1, int param2) {
        if (!param1) {
            return false;
        }
        if (!(param2 != -1)) {
            return false;
        }
        if (!(0 != param2)) {
            return ((kg) this).field_c.a(1, param0);
        }
        if (1 != param2) {
            return false;
        }
        return ((kg) this).field_c.a(param0, (byte) -113);
    }

    final boolean a(int param0) {
        gn[] var2 = null;
        int var3 = 0;
        gn var4 = null;
        int var5 = 0;
        gn[] var6 = null;
        var5 = EscapeVector.field_A;
        if (!((kg) this).field_c.d((byte) -83)) {
          return false;
        } else {
          var6 = ((kg) this).field_d;
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var6.length) {
              if (param0 == -19836) {
                return true;
              } else {
                boolean discarded$1 = ((kg) this).g(80);
                return true;
              }
            } else {
              var4 = var6[var3];
              if ((var4.field_d ^ -1) != -2) {
                if (!var4.field_i) {
                  return false;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    final boolean b(int param0, int param1, int param2) {
        gn[] var4 = null;
        int var5 = 0;
        gn var6 = null;
        int var7 = 0;
        var7 = EscapeVector.field_A;
        if (((kg) this).field_d != null) {
          L0: {
            var4 = ((kg) this).field_d;
            var5 = 0;
            if (param0 == 15954) {
              break L0;
            } else {
              ((kg) this).field_e = null;
              break L0;
            }
          }
          L1: while (true) {
            if (var5 >= var4.length) {
              return false;
            } else {
              var6 = var4[var5];
              if (var6 != null) {
                if (param1 == var6.field_j) {
                  return var6.a(0, param2);
                } else {
                  var5++;
                  continue L1;
                }
              } else {
                var5++;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Orb points: ";
        field_b = "Email: ";
    }
}
