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
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final synchronized static byte[] b(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (param0 != -101) {
          L0: {
            if (-5001 != (param0 ^ -1)) {
              break L0;
            } else {
              if ((be.field_i ^ -1) >= -1) {
                break L0;
              } else {
                be.field_i = be.field_i - 1;
                var2_ref_byte__ = ch.field_z[be.field_i - 1];
                ch.field_z[be.field_i] = null;
                return var2_ref_byte__;
              }
            }
          }
          if (param1 != (param0 ^ -1)) {
            if (null != me.field_i) {
              var2 = 0;
              L1: while (true) {
                if (sa.field_R.length <= var2) {
                  return new byte[param0];
                } else {
                  if (param0 != sa.field_R[var2]) {
                    var2++;
                    var2++;
                    continue L1;
                  } else {
                    if ((ai.field_e[var2] ^ -1) < -1) {
                      ai.field_e[var2] = ai.field_e[var2] - 1;
                      var3 = me.field_i[var2][ai.field_e[var2] - 1];
                      me.field_i[var2][ai.field_e[var2]] = null;
                      return var3;
                    } else {
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              return new byte[param0];
            }
          } else {
            if (0 < ee.field_e) {
              ee.field_e = ee.field_e - 1;
              var2_ref_byte__ = hf.field_b[ee.field_e - 1];
              hf.field_b[ee.field_e] = null;
              return var2_ref_byte__;
            } else {
              if (null != me.field_i) {
                var2 = 0;
                L2: while (true) {
                  if (sa.field_R.length <= var2) {
                    return new byte[param0];
                  } else {
                    if (param0 != sa.field_R[var2]) {
                      var2++;
                      var2++;
                      continue L2;
                    } else {
                      if ((ai.field_e[var2] ^ -1) < -1) {
                        ai.field_e[var2] = ai.field_e[var2] - 1;
                        var3 = me.field_i[var2][ai.field_e[var2] - 1];
                        me.field_i[var2][ai.field_e[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                return new byte[param0];
              }
            }
          }
        } else {
          if (-1 >= mf.field_c) {
            if (-5001 == param0) {
              if (be.field_i >= -1) {
                if (param1 != param0) {
                  if (null != me.field_i) {
                    var2 = 0;
                    L3: while (true) {
                      if (sa.field_R.length > var2) {
                        if (param0 != sa.field_R[var2]) {
                          var2++;
                          var2++;
                          continue L3;
                        } else {
                          if ((ai.field_e[var2] ^ -1) < -1) {
                            ai.field_e[var2] = ai.field_e[var2] - 1;
                            var3 = me.field_i[var2][ai.field_e[var2] - 1];
                            me.field_i[var2][ai.field_e[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L3;
                          }
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
                      var2 = 0;
                      if (sa.field_R.length > var2) {
                        if (param0 == sa.field_R[var2]) {
                          if ((ai.field_e[var2] ^ -1) >= -1) {
                            var2++;
                            var2++;
                            var2++;
                            return new byte[param0];
                          } else {
                            ai.field_e[var2] = ai.field_e[var2] - 1;
                            var3 = me.field_i[var2][ai.field_e[var2] - 1];
                            me.field_i[var2][ai.field_e[var2]] = null;
                            return var3;
                          }
                        } else {
                          var2++;
                          var2++;
                          var2++;
                          return new byte[param0];
                        }
                      } else {
                        return new byte[param0];
                      }
                    } else {
                      return new byte[param0];
                    }
                  } else {
                    ee.field_e = ee.field_e - 1;
                    var2_ref_byte__ = hf.field_b[ee.field_e - 1];
                    hf.field_b[ee.field_e] = null;
                    return var2_ref_byte__;
                  }
                }
              } else {
                be.field_i = be.field_i - 1;
                var2_ref_byte__ = ch.field_z[be.field_i - 1];
                ch.field_z[be.field_i] = null;
                return var2_ref_byte__;
              }
            } else {
              L4: {
                if (param1 != param0) {
                  break L4;
                } else {
                  if (0 < ee.field_e) {
                    ee.field_e = ee.field_e - 1;
                    var2_ref_byte__ = hf.field_b[ee.field_e - 1];
                    hf.field_b[ee.field_e] = null;
                    return var2_ref_byte__;
                  } else {
                    break L4;
                  }
                }
              }
              if (null != me.field_i) {
                var2 = 0;
                if (sa.field_R.length > var2) {
                  if (param0 == sa.field_R[var2]) {
                    if ((ai.field_e[var2] ^ -1) < -1) {
                      ai.field_e[var2] = ai.field_e[var2] - 1;
                      var3 = me.field_i[var2][ai.field_e[var2] - 1];
                      me.field_i[var2][ai.field_e[var2]] = null;
                      return var3;
                    } else {
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      return new byte[param0];
                    }
                  } else {
                    var2++;
                    var2++;
                    var2++;
                    var2++;
                    return new byte[param0];
                  }
                } else {
                  return new byte[param0];
                }
              } else {
                return new byte[param0];
              }
            }
          } else {
            mf.field_c = mf.field_c - 1;
            var2_ref_byte__ = f.field_b[mf.field_c - 1];
            f.field_b[mf.field_c] = null;
            return var2_ref_byte__;
          }
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        vk var4 = null;
        var3 = TrackController.field_F ? 1 : 0;
        if (param0 == -101) {
          var4 = (vk) (Object) ea.field_t.b(2);
          L0: while (true) {
            if (var4 == null) {
              return;
            } else {
              ef.a(var4, param1, param0 + 111);
              var4 = (vk) (Object) ea.field_t.a(param0 + 111);
              continue L0;
            }
          }
        } else {
          ke.a(true);
          var4 = (vk) (Object) ea.field_t.b(2);
          L1: while (true) {
            if (var4 == null) {
              return;
            } else {
              ef.a(var4, param1, param0 + 111);
              var4 = (vk) (Object) ea.field_t.a(param0 + 111);
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Use this alternative as your account name";
        field_a = new int[12];
    }
}
