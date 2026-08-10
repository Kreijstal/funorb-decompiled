/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ii {
    static boolean field_e;
    static ul field_a;
    static String field_b;
    static ja field_c;
    static long field_d;

    final static void a(int param0, byte param1, int param2, String param3, long param4) {
        try {
            v.field_a = param3;
            da.field_c = param4;
            vh.field_Hb = true;
            fh.field_n = param0;
            mi.field_Gb = param2;
            if (param1 > -108) {
                ii.b((byte) -126);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ii.J(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    abstract long a(byte param0);

    public static void c(int param0) {
        String var2;
        if (param0 != -26028) {
          var2 = (String) null;
          ii.a((String) null, (byte) -103, -24);
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        }
    }

    abstract int a(long param0, boolean param1);

    abstract void b(int param0);

    final static void a(int param0) {
        nc[] var1 = null;
        int var2 = 0;
        nc var3 = null;
        int var4 = 0;
        nc[] var6 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        String var5 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!ap.field_s) {
              ap.field_s = true;
              var6 = mj.field_Hb;
              var1 = var6;
              var2 = 0;
              L1: while (true) {
                if (var6.length <= var2) {
                  if (param0 > 62) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var5 = (String) null;
                    ii.a((String) null, (byte) 19, -44);
                    return;
                  }
                } else {
                  L2: {
                    var3 = var6[var2];
                    if (var3 != null) {
                      var3.c(1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "ii.L(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(String param0, byte param1, int param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ga var5 = null;
        CharSequence var6 = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param0);
            if (!em.a(var6, (byte) -38)) {
              stackIn_3_0 = u.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((ge.field_zb ^ -1) == -3) {
                if (sf.a(1, param0)) {
                  stackIn_10_0 = hf.field_b;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!kj.a((byte) -94, param0)) {
                    L1: {
                      if (param1 == 116) {
                        break L1;
                      } else {
                        ii.b((byte) -55);
                        break L1;
                      }
                    }
                    L2: {
                      if (100 > dc.field_Fb) {
                        break L2;
                      } else {
                        if (0 < vl.field_h) {
                          break L2;
                        } else {
                          stackIn_19_0 = eh.field_g;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                    if (200 <= dc.field_Fb) {
                      stackIn_23_0 = eh.field_g;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      if (!hp.a(param0, param1 + 904)) {
                        var5 = ma.field_a;
                        var5.b((byte) -35, param2);
                        var5.field_j = var5.field_j + 1;
                        var4 = var5.field_j;
                        var5.a(124, 0);
                        var5.a(param0, (byte) 105);
                        var5.e(21, -var4 + var5.field_j);
                        stackIn_28_0 = null;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        stackIn_26_0 = vl.a(wf.field_r, new String[]{param0}, param1 + -114);
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_13_0 = vl.a(jf.field_b, new String[]{param0}, 2);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_6_0 = le.field_G;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("ii.Q(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L3;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_26_0;
                    } else {
                      return (String) ((Object) stackIn_28_0);
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, String param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 != hl.field_a) {
                break L1;
              } else {
                if ((tn.field_z ^ -1) == 0) {
                  hl.field_a = bd.field_g;
                  tn.field_z = bo.field_d;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                l.field_a = l.field_a + 1;
                if (param1 != null) {
                  if (param1.equals(kg.field_k)) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (null != kg.field_k) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!cb.field_l) {
                  if (l.field_a >= um.field_h) {
                    if (l.field_a < br.field_a + um.field_h) {
                      stackIn_17_0 = 1;
                      break L4;
                    } else {
                      stackIn_17_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_17_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_17_0 = 0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param1 == null) {
                  l.field_a = 0;
                  break L5;
                } else {
                  if (cb.field_l) {
                    l.field_a = um.field_h;
                    break L5;
                  } else {
                    if (var2_int != 0) {
                      l.field_a = um.field_h;
                      break L5;
                    } else {
                      l.field_a = 0;
                      break L5;
                    }
                  }
                }
              }
              tf.field_Db = hl.field_a;
              bl.field_c = tn.field_z;
              if (param1 == null) {
                if (var2_int == 0) {
                  break L2;
                } else {
                  cb.field_l = true;
                  break L2;
                }
              } else {
                cb.field_l = false;
                break L2;
              }
            }
            L6: {
              kg.field_k = param1;
              if (cb.field_l) {
                break L6;
              } else {
                if (um.field_h <= l.field_a) {
                  break L6;
                } else {
                  if (!wc.field_J) {
                    break L6;
                  } else {
                    l.field_a = 0;
                    bl.field_c = tn.field_z;
                    tf.field_Db = hl.field_a;
                    break L6;
                  }
                }
              }
            }
            L7: {
              if (param0 == -16898) {
                break L7;
              } else {
                ii.b((byte) -126);
                break L7;
              }
            }
            L8: {
              if (!cb.field_l) {
                break L8;
              } else {
                if (ti.field_I != l.field_a) {
                  break L8;
                } else {
                  l.field_a = 0;
                  cb.field_l = false;
                  break L8;
                }
              }
            }
            tn.field_z = -1;
            hl.field_a = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var2);

            stackIn_42_1 = new StringBuilder().append("ii.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L9;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
    }

    final static int b(byte param0) {
        int var1 = 96 / ((param0 - -12) / 33);
        return pl.field_F;
    }

    final int b(long param0, boolean param1) {
        long var4;
        var4 = this.a((byte) -64);
        if (!param1) {
          if (0L < var4) {
            vd.a(false, var4);
            return this.a(param0, true);
          } else {
            return this.a(param0, true);
          }
        } else {
          field_b = (String) null;
          if (0L >= var4) {
            return this.a(param0, true);
          } else {
            vd.a(false, var4);
            return this.a(param0, true);
          }
        }
    }

    final static void a(int param0, int param1) {
        ga var2;
        var2 = ma.field_a;
        var2.b((byte) -35, param0);
        var2.a(126, 1);
        var2.a(-24, 0);
        if (param1 != -1) {
          ii.a(64, (byte) 88, -76, (String) null, 34L);
          return;
        } else {
          return;
        }
    }

    static {
        field_b = "<br><br>";
    }
}
