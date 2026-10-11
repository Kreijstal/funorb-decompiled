/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static al field_c;
    static long field_a;
    static ts field_b;

    final static void a(byte param0) {
        int var3 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        String stackIn_29_0 = null;
        String stackIn_36_0 = null;
        int stackIn_42_0 = 0;
        String stackIn_42_1 = null;
        boolean stackIn_43_2 = false;
        qn stackIn_48_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        qn var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          var1_int = hh.field_f;
          if (param0 < 118) {
            sj.a(false);
          }
          var2 = 0;
          if (cl.field_s == 2) {
            var3_long = wq.a(-124) - iv.field_f;
            var2 = (int)((10999L - var3_long) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          for (var3 = 0; bf.field_c.length > var3; var3++) {
            var4 = eb.field_a[var3];
            if (0 <= var4) {
              if (nj.field_a.field_g != var4) {
                var5 = rc.field_j;
              } else {
                var5 = ds.field_a;
              }
            } else {
              var5 = ke.field_d;
            }
            var6 = bf.field_c[var3];
            if (2 == cl.field_s &&
              1 == var2) {
              if (no.field_b.length >= hf.field_F.length) {
                stackIn_20_0 = no.field_b.length;
              } else {
                stackIn_20_0 = hf.field_F.length;
              }
              var7 = stackIn_20_0;
              if (uw.field_c.length >= uw.field_b.length) {
                stackIn_23_0 = uw.field_c.length;
              } else {
                stackIn_23_0 = uw.field_b.length;
              }
              var8 = stackIn_23_0;
              if (6 <= var3 &&
                var3 < 6 + var7) {
                if (-var7 + (-6 + var3 + no.field_b.length) >= 0) {
                  stackIn_29_0 = no.field_b[-var7 + no.field_b.length + (var3 - 6)];
                } else {
                  stackIn_29_0 = "";
                }
                var6 = stackIn_29_0;
              }
              if (var7 + 7 <= var3 &&
                var8 + var7 + 7 > var3) {
                if (-var7 + (var3 - 7) >= uw.field_c.length) {
                  stackIn_36_0 = "";
                } else {
                  stackIn_36_0 = uw.field_c[-var7 + var3 - 7];
                }
                var6 = stackIn_36_0;
              }
            }
            if (-2 == var4) {
              var6 = Integer.toString(var2);
            }
            stackIn_42_0 = -9;
            stackIn_42_1 = var6;
            stackIn_43_2 = !(0 > var4);
            var7Lifetime1 = gt.$cfr$intArgs$a$590e95718a07(stackIn_42_0, stackIn_42_1, stackIn_43_2);
            var8Lifetime1 = -(var7Lifetime1 >> 1) + oj.field_a;
            if (var4 >= 0) {
              var1_int = var1_int + qc.field_a;
              if (var4 != nj.field_a.field_g) {
                stackIn_48_0 = vp.field_e;
              } else {
                stackIn_48_0 = fs.field_k;
              }
              var9 = stackIn_48_0;
              if (var9 != null) {
                var9.a((dw.field_b << 1) + var7Lifetime1, -dw.field_b + var8Lifetime1, (ag.field_b << 1) + ga.field_h, 101, var1_int);
              }
              var1_int = var1_int + ag.field_b;
            }
            if (var4 < 0) {
              qq.field_R.b(var6, var8Lifetime1, var1_int + ia.field_d, var5, -1);
              var1_int = var1_int + fn.field_t;
            } else {
              ns.field_a.b(var6, var8Lifetime1, var1_int + dl.field_f, var5, -1);
              var1_int = var1_int + (qc.field_a + (ag.field_b + ga.field_h));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "sj.C(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
          sj.a(-105, -2, -5);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static boolean a(int param0) {
        nl.field_o = true;
        field_a = 15000L + wq.a(-13);
        if (param0 < -26) {
          return jv.field_a == 11 ? true : false;
        }
        field_b = (ts) null;
        return jv.field_a == 11 ? true : false;
    }

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == -1) {
          if (!t.field_p[param2] &&
            !wm.field_f[param2]) {
            var3 = param2;
            if (0 == var3) {
              if (param1 == 0) {
                fq.field_f.a(param0 ^ 3387, 16);
              }
              if (param1 == 1) {
                fq.field_f.a(-3388, 0);
              }
              if (2 == param1) {
                fq.field_f.a(-3388, 1);
                t.field_p[param2] = true;
              }
              return;
            }
            if (1 == var3) {
              if (0 == param1) {
                fq.field_f.a(param0 ^ 3387, 2);
                t.field_p[param2] = true;
              }
              return;
            }
            if (var3 != 2) {
              if (var3 == 3) {
                if (param1 != 0) {
                  return;
                }
                fq.field_f.a(-3388, 6);
              } else {
                if (4 == var3) {
                  if (0 == param1) {
                    fq.field_f.a(-3388, 7);
                  }
                  if (param1 == 1) {
                    fq.field_f.a(param0 ^ 3387, 4);
                  }
                  if (param1 == 2) {
                    fq.field_f.a(-3388, 8);
                  }
                  if (param1 != 3) {
                    return;
                  }
                  fq.field_f.a(param0 ^ 3387, 9);
                } else {
                  if (var3 != 5) {
                    if (6 != var3) {
                      if (var3 == 8) {
                        if (param1 != 1) {
                          return;
                        }
                        fq.field_f.a(-3388, 11);
                      } else {
                        if (var3 == 9) {
                          if (0 != param1) {
                            return;
                          }
                          fq.field_f.a(-3388, 12);
                        } else {
                          if (var3 == 10) {
                            if (0 != param1) {
                              return;
                            }
                            fq.field_f.a(param0 ^ 3387, 13);
                          } else {
                            if (11 != var3) {
                              return;
                            }
                            if (param1 != 0) {
                              return;
                            }
                            fq.field_f.a(-3388, 14);
                          }
                        }
                      }
                    } else {
                      if (0 == param1) {
                        fq.field_f.a(-3388, 18);
                      }
                      if (param1 != 4) {
                        return;
                      }
                      fq.field_f.a(param0 - 3387, 15);
                    }
                  } else {
                    if (param1 != 0) {
                      return;
                    }
                    fq.field_f.a(-3388, 10);
                  }
                }
              }
            } else {
              if (param1 == 0) {
                fq.field_f.a(param0 ^ 3387, 5);
              }
              if (param1 != 5) {
                return;
              }
              fq.field_f.a(-3388, 3);
            }
            t.field_p[param2] = true;
            return;
          }
          return;
        }
        sj.a(-9);
        if (t.field_p[param2]) {
          return;
        }
        if (wm.field_f[param2]) {
          return;
        }
        var3Lifetime1 = param2;
        if (0 == var3Lifetime1) {
          if (param1 == 0) {
            fq.field_f.a(param0 ^ 3387, 16);
          }
          if (param1 == 1) {
            fq.field_f.a(-3388, 0);
          }
          if (2 != param1) {
            return;
          }
          fq.field_f.a(-3388, 1);
        } else {
          if (1 == var3Lifetime1) {
            if (0 != param1) {
              return;
            }
            fq.field_f.a(param0 ^ 3387, 2);
          } else {
            if (var3Lifetime1 != 2) {
              if (var3Lifetime1 == 3) {
                if (param1 != 0) {
                  return;
                }
                fq.field_f.a(-3388, 6);
              } else {
                if (4 == var3Lifetime1) {
                  if (0 == param1) {
                    fq.field_f.a(-3388, 7);
                  }
                  if (param1 == 1) {
                    fq.field_f.a(param0 ^ 3387, 4);
                  }
                  if (param1 == 2) {
                    fq.field_f.a(-3388, 8);
                  }
                  if (param1 != 3) {
                    return;
                  }
                  fq.field_f.a(param0 ^ 3387, 9);
                } else {
                  if (var3Lifetime1 != 5) {
                    if (6 != var3Lifetime1) {
                      if (var3Lifetime1 != 8) {
                        if (var3Lifetime1 == 9) {
                          if (0 != param1) {
                            return;
                          }
                          fq.field_f.a(-3388, 12);
                        } else {
                          if (var3Lifetime1 == 10) {
                            if (0 != param1) {
                              return;
                            }
                            fq.field_f.a(param0 ^ 3387, 13);
                          } else {
                            if (11 != var3Lifetime1) {
                              return;
                            }
                            if (param1 != 0) {
                              return;
                            }
                            fq.field_f.a(-3388, 14);
                          }
                        }
                      } else {
                        if (param1 != 1) {
                          return;
                        }
                        fq.field_f.a(-3388, 11);
                      }
                    } else {
                      if (0 == param1) {
                        fq.field_f.a(-3388, 18);
                      }
                      if (param1 != 4) {
                        return;
                      }
                      fq.field_f.a(param0 - 3387, 15);
                    }
                  } else {
                    if (param1 != 0) {
                      return;
                    }
                    fq.field_f.a(-3388, 10);
                  }
                }
              }
            } else {
              if (param1 == 0) {
                fq.field_f.a(param0 ^ 3387, 5);
              }
              if (param1 != 5) {
                return;
              }
              fq.field_f.a(-3388, 3);
            }
          }
        }
        t.field_p[param2] = true;
        return;
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!g.a(param0, 0, param2)) {
            return false;
          }
          var3_int = 0;
          while (true) {
            if (param2.length() <= var3_int) {
              if (param1 > 122) {
                return true;
              }
              sj.a(-58);
              return true;
            }
            if (jl.a((byte) 110, param2.charAt(var3_int))) {
              var3_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("sj.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_b = new ts(2, 4, 4, 0);
    }
}
