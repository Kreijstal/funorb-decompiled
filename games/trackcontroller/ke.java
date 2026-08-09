/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static String field_b;
    static int field_c;
    static int[] field_a;

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            field_a = (int[]) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final synchronized static byte[] b(int param0, int param1) {
        int fieldTemp$2 = 0;
        int dupTemp$3 = 0;
        byte[][] arrayValue$4 = null;
        int fieldTemp$5 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        int dupTemp$8 = 0;
        byte[][] arrayValue$9 = null;
        int fieldTemp$10 = 0;
        int dupTemp$11 = 0;
        byte[][] arrayValue$12 = null;
        int dupTemp$13 = 0;
        byte[][] arrayValue$14 = null;
        int dupTemp$15 = 0;
        byte[][] arrayValue$16 = null;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int dupTemp$20 = 0;
        byte[][] arrayValue$21 = null;
        int fieldTemp$22 = 0;
        byte[] var2;
        int var2_int;
        byte[] var3;
        if ((param0 ^ -1) != -101) {
          if (-5001 == (param0 ^ -1)) {
            if ((be.field_i ^ -1) < -1) {
              fieldTemp$2 = be.field_i - 1;
              be.field_i = be.field_i - 1;
              var2 = ch.field_z[fieldTemp$2];
              ch.field_z[be.field_i] = null;
              return var2;
            } else {
              if (param1 != (param0 ^ -1)) {
                if (null != me.field_i) {
                  var2_int = 0;
                  L0: while (true) {
                    if (sa.field_R.length <= var2_int) {
                      return new byte[param0];
                    } else {
                      if (param0 == sa.field_R[var2_int]) {
                        if ((ai.field_e[var2_int] ^ -1) < -1) {
                          dupTemp$3 = ai.field_e[var2_int] - 1;
                          arrayValue$4 = me.field_i[var2_int];
                          ai.field_e[var2_int] = dupTemp$3;
                          var3 = arrayValue$4[dupTemp$3];
                          me.field_i[var2_int][ai.field_e[var2_int]] = null;
                          return var3;
                        } else {
                          var2_int++;
                          continue L0;
                        }
                      } else {
                        var2_int++;
                        continue L0;
                      }
                    }
                  }
                } else {
                  return new byte[param0];
                }
              } else {
                if (0 < ee.field_e) {
                  fieldTemp$5 = ee.field_e - 1;
                  ee.field_e = ee.field_e - 1;
                  var2 = hf.field_b[fieldTemp$5];
                  hf.field_b[ee.field_e] = null;
                  return var2;
                } else {
                  if (null != me.field_i) {
                    var2_int = 0;
                    L1: while (true) {
                      if (sa.field_R.length <= var2_int) {
                        return new byte[param0];
                      } else {
                        if (param0 == sa.field_R[var2_int]) {
                          if ((ai.field_e[var2_int] ^ -1) < -1) {
                            dupTemp$6 = ai.field_e[var2_int] - 1;
                            arrayValue$7 = me.field_i[var2_int];
                            ai.field_e[var2_int] = dupTemp$6;
                            var3 = arrayValue$7[dupTemp$6];
                            me.field_i[var2_int][ai.field_e[var2_int]] = null;
                            return var3;
                          } else {
                            var2_int++;
                            continue L1;
                          }
                        } else {
                          var2_int++;
                          continue L1;
                        }
                      }
                    }
                  } else {
                    return new byte[param0];
                  }
                }
              }
            }
          } else {
            if (param1 != (param0 ^ -1)) {
              if (null != me.field_i) {
                var2_int = 0;
                L2: while (true) {
                  if (sa.field_R.length <= var2_int) {
                    return new byte[param0];
                  } else {
                    if (param0 == sa.field_R[var2_int]) {
                      if ((ai.field_e[var2_int] ^ -1) < -1) {
                        dupTemp$8 = ai.field_e[var2_int] - 1;
                        arrayValue$9 = me.field_i[var2_int];
                        ai.field_e[var2_int] = dupTemp$8;
                        var3 = arrayValue$9[dupTemp$8];
                        me.field_i[var2_int][ai.field_e[var2_int]] = null;
                        return var3;
                      } else {
                        var2_int++;
                        continue L2;
                      }
                    } else {
                      var2_int++;
                      continue L2;
                    }
                  }
                }
              } else {
                return new byte[param0];
              }
            } else {
              if (0 < ee.field_e) {
                fieldTemp$10 = ee.field_e - 1;
                ee.field_e = ee.field_e - 1;
                var2 = hf.field_b[fieldTemp$10];
                hf.field_b[ee.field_e] = null;
                return var2;
              } else {
                if (null != me.field_i) {
                  var2_int = 0;
                  L3: while (true) {
                    if (sa.field_R.length <= var2_int) {
                      return new byte[param0];
                    } else {
                      if (param0 == sa.field_R[var2_int]) {
                        if ((ai.field_e[var2_int] ^ -1) < -1) {
                          dupTemp$11 = ai.field_e[var2_int] - 1;
                          arrayValue$12 = me.field_i[var2_int];
                          ai.field_e[var2_int] = dupTemp$11;
                          var3 = arrayValue$12[dupTemp$11];
                          me.field_i[var2_int][ai.field_e[var2_int]] = null;
                          return var3;
                        } else {
                          var2_int++;
                          continue L3;
                        }
                      } else {
                        var2_int++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  return new byte[param0];
                }
              }
            }
          }
        } else {
          if (-1 <= (mf.field_c ^ -1)) {
            if (-5001 == (param0 ^ -1)) {
              if ((be.field_i ^ -1) >= -1) {
                if (param1 != (param0 ^ -1)) {
                  if (null != me.field_i) {
                    var2_int = 0;
                    L4: while (true) {
                      if (sa.field_R.length > var2_int) {
                        if (param0 == sa.field_R[var2_int]) {
                          if ((ai.field_e[var2_int] ^ -1) < -1) {
                            dupTemp$13 = ai.field_e[var2_int] - 1;
                            arrayValue$14 = me.field_i[var2_int];
                            ai.field_e[var2_int] = dupTemp$13;
                            var3 = arrayValue$14[dupTemp$13];
                            me.field_i[var2_int][ai.field_e[var2_int]] = null;
                            return var3;
                          } else {
                            var2_int++;
                            continue L4;
                          }
                        } else {
                          var2_int++;
                          continue L4;
                        }
                      } else {
                        return new byte[param0];
                      }
                    }
                  } else {
                    return new byte[param0];
                  }
                } else {
                  if (0 >= ee.field_e) {
                    if (null != me.field_i) {
                      var2_int = 0;
                      L5: while (true) {
                        if (sa.field_R.length > var2_int) {
                          if (param0 == sa.field_R[var2_int]) {
                            if ((ai.field_e[var2_int] ^ -1) < -1) {
                              dupTemp$15 = ai.field_e[var2_int] - 1;
                              arrayValue$16 = me.field_i[var2_int];
                              ai.field_e[var2_int] = dupTemp$15;
                              var3 = arrayValue$16[dupTemp$15];
                              me.field_i[var2_int][ai.field_e[var2_int]] = null;
                              return var3;
                            } else {
                              var2_int++;
                              continue L5;
                            }
                          } else {
                            var2_int++;
                            continue L5;
                          }
                        } else {
                          return new byte[param0];
                        }
                      }
                    } else {
                      return new byte[param0];
                    }
                  } else {
                    fieldTemp$17 = ee.field_e - 1;
                    ee.field_e = ee.field_e - 1;
                    var2 = hf.field_b[fieldTemp$17];
                    hf.field_b[ee.field_e] = null;
                    return var2;
                  }
                }
              } else {
                fieldTemp$18 = be.field_i - 1;
                be.field_i = be.field_i - 1;
                var2 = ch.field_z[fieldTemp$18];
                ch.field_z[be.field_i] = null;
                return var2;
              }
            } else {
              L6: {
                if (param1 != (param0 ^ -1)) {
                  break L6;
                } else {
                  if (0 < ee.field_e) {
                    fieldTemp$19 = ee.field_e - 1;
                    ee.field_e = ee.field_e - 1;
                    var2 = hf.field_b[fieldTemp$19];
                    hf.field_b[ee.field_e] = null;
                    return var2;
                  } else {
                    break L6;
                  }
                }
              }
              if (null != me.field_i) {
                var2_int = 0;
                L7: while (true) {
                  if (sa.field_R.length > var2_int) {
                    if (param0 == sa.field_R[var2_int]) {
                      if ((ai.field_e[var2_int] ^ -1) < -1) {
                        dupTemp$20 = ai.field_e[var2_int] - 1;
                        arrayValue$21 = me.field_i[var2_int];
                        ai.field_e[var2_int] = dupTemp$20;
                        var3 = arrayValue$21[dupTemp$20];
                        me.field_i[var2_int][ai.field_e[var2_int]] = null;
                        return var3;
                      } else {
                        var2_int++;
                        continue L7;
                      }
                    } else {
                      var2_int++;
                      continue L7;
                    }
                  } else {
                    return new byte[param0];
                  }
                }
              } else {
                return new byte[param0];
              }
            }
          } else {
            fieldTemp$22 = mf.field_c - 1;
            mf.field_c = mf.field_c - 1;
            var2 = f.field_b[fieldTemp$22];
            f.field_b[mf.field_c] = null;
            return var2;
          }
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        vk var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -101) {
                break L1;
              } else {
                ke.a(true);
                break L1;
              }
            }
            var4 = (vk) ((Object) ea.field_t.b(2));
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                ef.a(var4, param1, param0 + 111);
                var4 = (vk) ((Object) ea.field_t.a(param0 + 111));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var2), "ke.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = "Use this alternative as your account name";
        field_a = new int[12];
    }
}
