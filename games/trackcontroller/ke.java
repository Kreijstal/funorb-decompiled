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
        if (param0 != 100) {
          L0: {
            if (param0 != 5000) {
              break L0;
            } else {
              if (be.field_i <= 0) {
                break L0;
              } else {
                int fieldTemp$222 = be.field_i - 1;
                be.field_i = be.field_i - 1;
                var2_ref_byte__ = ch.field_z[fieldTemp$222];
                ch.field_z[be.field_i] = null;
                return var2_ref_byte__;
              }
            }
          }
          if (param0 != 30000) {
            if (null != me.field_i) {
              var2 = 0;
              L1: while (true) {
                if (~sa.field_R.length >= ~var2) {
                  return new byte[param0];
                } else {
                  L2: {
                    if (param0 != sa.field_R[var2]) {
                      var2++;
                      break L2;
                    } else {
                      if (ai.field_e[var2] <= 0) {
                        break L2;
                      } else {
                        ai.field_e[var2] = ai.field_e[var2] - 1;
                        var3 = me.field_i[var2][ai.field_e[var2] - 1];
                        me.field_i[var2][ai.field_e[var2]] = null;
                        return var3;
                      }
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            } else {
              return new byte[param0];
            }
          } else {
            if (0 < ee.field_e) {
              int fieldTemp$223 = ee.field_e - 1;
              ee.field_e = ee.field_e - 1;
              var2_ref_byte__ = hf.field_b[fieldTemp$223];
              hf.field_b[ee.field_e] = null;
              return var2_ref_byte__;
            } else {
              if (null != me.field_i) {
                var2 = 0;
                L3: while (true) {
                  if (~sa.field_R.length >= ~var2) {
                    return new byte[param0];
                  } else {
                    L4: {
                      if (param0 != sa.field_R[var2]) {
                        var2++;
                        break L4;
                      } else {
                        if (ai.field_e[var2] <= 0) {
                          break L4;
                        } else {
                          ai.field_e[var2] = ai.field_e[var2] - 1;
                          var3 = me.field_i[var2][ai.field_e[var2] - 1];
                          me.field_i[var2][ai.field_e[var2]] = null;
                          return var3;
                        }
                      }
                    }
                    var2++;
                    continue L3;
                  }
                }
              } else {
                return new byte[param0];
              }
            }
          }
        } else {
          if (mf.field_c > 0) {
            int fieldTemp$224 = mf.field_c - 1;
            mf.field_c = mf.field_c - 1;
            var2_ref_byte__ = f.field_b[fieldTemp$224];
            f.field_b[mf.field_c] = null;
            return var2_ref_byte__;
          } else {
            if (param0 == 5000) {
              if (be.field_i > 0) {
                int fieldTemp$225 = be.field_i - 1;
                be.field_i = be.field_i - 1;
                var2_ref_byte__ = ch.field_z[fieldTemp$225];
                ch.field_z[be.field_i] = null;
                return var2_ref_byte__;
              } else {
                if (param0 != 30000) {
                  if (null != me.field_i) {
                    var2 = 0;
                    L5: while (true) {
                      if (~sa.field_R.length >= ~var2) {
                        return new byte[param0];
                      } else {
                        L6: {
                          if (param0 != sa.field_R[var2]) {
                            var2++;
                            break L6;
                          } else {
                            if (ai.field_e[var2] <= 0) {
                              break L6;
                            } else {
                              ai.field_e[var2] = ai.field_e[var2] - 1;
                              var3 = me.field_i[var2][ai.field_e[var2] - 1];
                              me.field_i[var2][ai.field_e[var2]] = null;
                              return var3;
                            }
                          }
                        }
                        var2++;
                        continue L5;
                      }
                    }
                  } else {
                    return new byte[param0];
                  }
                } else {
                  if (0 < ee.field_e) {
                    int fieldTemp$226 = ee.field_e - 1;
                    ee.field_e = ee.field_e - 1;
                    var2_ref_byte__ = hf.field_b[fieldTemp$226];
                    hf.field_b[ee.field_e] = null;
                    return var2_ref_byte__;
                  } else {
                    L7: {
                      if (null != me.field_i) {
                        var2 = 0;
                        if (~sa.field_R.length >= ~var2) {
                          break L7;
                        } else {
                          L8: {
                            if (param0 != sa.field_R[var2]) {
                              var2++;
                              break L8;
                            } else {
                              if (ai.field_e[var2] <= 0) {
                                var2++;
                                break L8;
                              } else {
                                ai.field_e[var2] = ai.field_e[var2] - 1;
                                var3 = me.field_i[var2][ai.field_e[var2] - 1];
                                me.field_i[var2][ai.field_e[var2]] = null;
                                return var3;
                              }
                            }
                          }
                          var2++;
                          var2++;
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    return new byte[param0];
                  }
                }
              }
            } else {
              L9: {
                if (param0 != 30000) {
                  break L9;
                } else {
                  if (0 < ee.field_e) {
                    int fieldTemp$227 = ee.field_e - 1;
                    ee.field_e = ee.field_e - 1;
                    var2_ref_byte__ = hf.field_b[fieldTemp$227];
                    hf.field_b[ee.field_e] = null;
                    return var2_ref_byte__;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (null != me.field_i) {
                  var2 = 0;
                  if (~sa.field_R.length >= ~var2) {
                    break L10;
                  } else {
                    L11: {
                      if (param0 != sa.field_R[var2]) {
                        var2++;
                        break L11;
                      } else {
                        if (ai.field_e[var2] <= 0) {
                          var2++;
                          break L11;
                        } else {
                          ai.field_e[var2] = ai.field_e[var2] - 1;
                          var3 = me.field_i[var2][ai.field_e[var2] - 1];
                          me.field_i[var2][ai.field_e[var2]] = null;
                          return var3;
                        }
                      }
                    }
                    var2++;
                    var2++;
                    var2++;
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
              return new byte[param0];
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        vk var4 = null;
        RuntimeException decompiledCaughtException = null;
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
            var4 = (vk) (Object) ea.field_t.b(2);
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                ef.a(var4, 2, param0 + 111);
                var4 = (vk) (Object) ea.field_t.a(param0 + 111);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "ke.A(" + param0 + 44 + 2 + 41);
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
