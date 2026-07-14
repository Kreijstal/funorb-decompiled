/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dj {
    static String field_a;
    static StringBuilder field_b;
    static String field_c;

    abstract byte[] a(boolean param0);

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 48) {
            return;
        }
        field_b = null;
    }

    final static String a(CharSequence param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        StringBuilder var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        var2 = 55 % ((-79 - param1) / 36);
        var3 = param0.length();
        var4 = new StringBuilder(var3);
        var5 = 0;
        L0: while (true) {
          if ((var3 ^ -1) >= (var5 ^ -1)) {
            return var4.toString();
          } else {
            L1: {
              var6 = param0.charAt(var5);
              if (var6 < 97) {
                break L1;
              } else {
                if (var6 <= 122) {
                  StringBuilder discarded$6 = var4.append(var6);
                  var5++;
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (var6 < 48) {
                break L2;
              } else {
                if (var6 <= 57) {
                  StringBuilder discarded$7 = var4.append(var6);
                  var5++;
                  continue L0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (var6 < 65) {
                break L3;
              } else {
                if (90 < var6) {
                  break L3;
                } else {
                  StringBuilder discarded$8 = var4.append((char)(32 + var6));
                  var5++;
                  var5++;
                  continue L0;
                }
              }
            }
            if (var6 == 43) {
              StringBuilder discarded$9 = var4.append(43);
              var5++;
              var5++;
              continue L0;
            } else {
              if (var6 != 38) {
                L4: {
                  var7 = var4.length();
                  if (0 >= var7) {
                    break L4;
                  } else {
                    if (-96 == (var4.charAt(-1 + var7) ^ -1)) {
                      break L4;
                    } else {
                      StringBuilder discarded$10 = var4.append(95);
                      var5++;
                      continue L0;
                    }
                  }
                }
                var5++;
                continue L0;
              } else {
                StringBuilder discarded$11 = var4.append(43);
                var5++;
                continue L0;
              }
            }
          }
        }
    }

    final static void a(boolean param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        if ((wj.field_o ^ -1) < -1) {
          if (vg.field_b == null) {
            L0: {
              ub.field_c = ql.a(0, 0, lk.field_b, 0, 640, 480);
              if (null != ub.field_c) {
                var2 = 2;
                cj.a((java.awt.Canvas) (Object) ub.field_c, 13861);
                break L0;
              } else {
                var2 = 3;
                break L0;
              }
            }
            L1: {
              if (null != vg.field_b) {
                break L1;
              } else {
                if (!wc.field_b) {
                  break L1;
                } else {
                  tf.a((byte) 46, param1, var2);
                  if (param0) {
                    return;
                  } else {
                    boolean discarded$10 = dj.b(1);
                    return;
                  }
                }
              }
            }
            if (param0) {
              return;
            } else {
              boolean discarded$11 = dj.b(1);
              return;
            }
          } else {
            L2: {
              ub.field_c = vg.field_b.d((byte) -18);
              kc.a(-14226, 2);
              if (null != ub.field_c) {
                var2 = 2;
                cj.a((java.awt.Canvas) (Object) ub.field_c, 13861);
                break L2;
              } else {
                var2 = 3;
                break L2;
              }
            }
            if (null == vg.field_b) {
              if (wc.field_b) {
                tf.a((byte) 46, param1, var2);
                if (param0) {
                  return;
                } else {
                  boolean discarded$12 = dj.b(1);
                  return;
                }
              } else {
                if (param0) {
                  return;
                } else {
                  boolean discarded$13 = dj.b(1);
                  return;
                }
              }
            } else {
              if (param0) {
                return;
              } else {
                boolean discarded$14 = dj.b(1);
                return;
              }
            }
          }
        } else {
          if (qj.b((byte) 73)) {
            var2 = 0;
            if (null == vg.field_b) {
              if (wc.field_b) {
                tf.a((byte) 46, param1, var2);
                if (param0) {
                  return;
                } else {
                  boolean discarded$15 = dj.b(1);
                  return;
                }
              } else {
                if (param0) {
                  return;
                } else {
                  boolean discarded$16 = dj.b(1);
                  return;
                }
              }
            } else {
              if (param0) {
                return;
              } else {
                boolean discarded$17 = dj.b(1);
                return;
              }
            }
          } else {
            var2 = 1;
            L3: {
              if (null != vg.field_b) {
                break L3;
              } else {
                if (!wc.field_b) {
                  break L3;
                } else {
                  tf.a((byte) 46, param1, var2);
                  if (param0) {
                    return;
                  } else {
                    boolean discarded$18 = dj.b(1);
                    return;
                  }
                }
              }
            }
            if (param0) {
              return;
            } else {
              boolean discarded$19 = dj.b(1);
              return;
            }
          }
        }
    }

    final static byte[] a(int param0, hj param1, byte[] param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        var4 = param1.k(param3, 1522829539);
        if (param0 == -39) {
          if ((var4 ^ -1) != -1) {
            if (param2 == null) {
              param2 = new byte[var4];
              var5 = param1.k(3, 1522829539);
              var6 = (byte)param1.k(8, 1522829539);
              if ((var5 ^ -1) < -1) {
                var7 = 0;
                L0: while (true) {
                  if (var4 > var7) {
                    param2[var7] = (byte)(param1.k(var5, ak.a(param0, -1522829510)) + var6);
                    var7++;
                    continue L0;
                  } else {
                    return param2;
                  }
                }
              } else {
                var7 = 0;
                L1: while (true) {
                  if (var4 > var7) {
                    param2[var7] = (byte)var6;
                    var7++;
                    continue L1;
                  } else {
                    return param2;
                  }
                }
              }
            } else {
              if ((var4 ^ -1) != (param2.length ^ -1)) {
                param2 = new byte[var4];
                var5 = param1.k(3, 1522829539);
                var6 = (byte)param1.k(8, 1522829539);
                if ((var5 ^ -1) < -1) {
                  var7 = 0;
                  L2: while (true) {
                    if (var4 > var7) {
                      param2[var7] = (byte)(param1.k(var5, ak.a(param0, -1522829510)) + var6);
                      var7++;
                      continue L2;
                    } else {
                      return param2;
                    }
                  }
                } else {
                  var7 = 0;
                  L3: while (true) {
                    if (var4 > var7) {
                      param2[var7] = (byte)var6;
                      var7++;
                      continue L3;
                    } else {
                      return param2;
                    }
                  }
                }
              } else {
                var5 = param1.k(3, 1522829539);
                var6 = (byte)param1.k(8, 1522829539);
                if ((var5 ^ -1) < -1) {
                  var7 = 0;
                  L4: while (true) {
                    if (var4 > var7) {
                      param2[var7] = (byte)(param1.k(var5, ak.a(param0, -1522829510)) + var6);
                      var7++;
                      continue L4;
                    } else {
                      return param2;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4 > var7) {
                      param2[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    } else {
                      return param2;
                    }
                  }
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static boolean a(char param0, boolean param1) {
        if (!param1) {
            return false;
        }
        if (param0 < 48) {
            return false;
        }
        if (57 < param0) {
            return false;
        }
        return true;
    }

    abstract void a(byte[] param0, byte param1);

    final static int a(boolean param0, int param1, int param2) {
        int var4 = Transmogrify.field_A ? 1 : 0;
        int var3 = 0;
        while ((param1 ^ -1) < -1) {
            var3 = var3 << 1782217825 | 1 & param2;
            param1--;
            param2 = param2 >>> 1;
        }
        if (!param0) {
            field_b = null;
            return var3;
        }
        return var3;
    }

    final static void a(boolean param0, String[] param1) {
        if (param0) {
            field_a = null;
            if (!(ta.field_f == null)) {
                ta.field_f.field_D.a(param1, 17036);
            }
            if (!(null == ca.field_g)) {
                ca.field_g.field_B.a(param1, 17036);
            }
            return;
        }
        if (!(ta.field_f == null)) {
            ta.field_f.field_D.a(param1, 17036);
        }
        if (!(null == ca.field_g)) {
            ca.field_g.field_B.a(param1, 17036);
        }
    }

    final static boolean b(int param0) {
        pd.field_b = true;
        if (param0 != -1) {
            return false;
        }
        qf.field_b = lk.a(param0 + 1) - -15000L;
        return 11 == gl.field_y ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for fonts";
        field_b = new StringBuilder(12);
    }
}
