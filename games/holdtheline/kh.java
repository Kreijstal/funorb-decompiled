/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kh extends gd {
    private String field_k;
    private boolean field_j;
    static String field_i;
    static hj field_l;
    private qf field_m;

    final static void b(boolean param0) {
        if ((bk.field_w ^ -1) == -11) {
          ka.a(-1);
          bk.field_w = 11;
          if (!param0) {
            de.field_K = true;
            return;
          } else {
            field_l = (hj) null;
            de.field_K = true;
            return;
          }
        } else {
          if (!ai.a(-91)) {
            ka.a(-1);
            bk.field_w = 11;
            if (param0) {
              field_l = (hj) null;
              de.field_K = true;
              return;
            } else {
              de.field_K = true;
              return;
            }
          } else {
            if (!param0) {
              de.field_K = true;
              return;
            } else {
              field_l = (hj) null;
              de.field_K = true;
              return;
            }
          }
        }
    }

    kh(nk param0, nk param1) {
        super(param0);
        this.field_k = "";
        this.field_j = false;
        try {
            this.field_m = new qf(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "kh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static gn a(int param0, boolean param1, boolean param2, boolean param3, int param4, int param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            rb var8 = null;
            gn stackIn_4_0 = null;
            gn stackIn_16_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  if (null == kl.field_v.field_u) {
                    break L1;
                  } else {
                    td.field_g = new ud(kl.field_v.field_u, 5200, 0);
                    kl.field_v.field_u = null;
                    var6 = new sk(255, td.field_g, new ud(kl.field_v.field_h, 12000, 0), 2097152);
                    break L1;
                  }
                }
                var7 = null;
                if (param4 == 10600) {
                  L2: {
                    if (null != td.field_g) {
                      L3: {
                        if (vb.field_a == null) {
                          vb.field_a = new ud[kl.field_v.field_g.length];
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (vb.field_a[param0] != null) {
                          break L4;
                        } else {
                          vb.field_a[param0] = new ud(kl.field_v.field_g[param0], 12000, 0);
                          kl.field_v.field_g[param0] = null;
                          break L4;
                        }
                      }
                      var7 = new sk(param0, td.field_g, vb.field_a[param0], 2097152);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L5: {
                    var8 = ra.field_Z.a(param0, param3, 113, (sk) (var6), (sk) (var7));
                    if (!param1) {
                      break L5;
                    } else {
                      var8.b((byte) -45);
                      break L5;
                    }
                  }
                  stackIn_16_0 = new gn(var8, param2, param5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_4_0 = (gn) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var6)).toString());
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_4_0;
            } else {
              return stackIn_16_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void g(int param0) {
        field_l = null;
        if (param0 != 0) {
            kh.b(true);
            field_i = null;
            return;
        }
        field_i = null;
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_m.a(param0, (byte) 84) == g.field_k) {
              stackIn_3_0 = this.field_m.a(param0, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  field_i = (String) null;
                  break L1;
                }
              }
              if (this.a(param0, (byte) 54) != g.field_k) {
                stackIn_10_0 = pk.field_J;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = gl.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("kh.L(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final static void a(boolean param0) {
        try {
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            try {
              L0: {
                if (!param0) {
                  L1: {
                    var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                    if (var1 == null) {
                      break L1;
                    } else {
                      try {
                        L2: {
                          var2 = Runtime.getRuntime();
                          var4 = (Object[]) null;
                          var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                          d.field_g = 1 + (int)(var3.longValue() / 1048576L);
                          decompiledRegionSelector0 = 0;
                          break L2;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L3: {
                          var2_ref = decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                          break L3;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        return;
                      } else {
                        break L1;
                      }
                    }
                  }
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector1 = 1;
                break L4;
              }
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final fd a(String param0, byte param1) {
        lc var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        fd stackIn_2_0 = null;
        fd stackIn_9_0 = null;
        fd stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_m.a(param0, (byte) 65) != g.field_k) {
              L1: {
                if (param1 > 52) {
                  break L1;
                } else {
                  var4 = (String) null;
                  this.a((String) null, (byte) -84);
                  break L1;
                }
              }
              L2: {
                if (!param0.equals(this.field_k)) {
                  var3 = we.a((byte) -85, param0);
                  if (var3.a(250)) {
                    this.field_k = param0;
                    this.field_j = var3.a((byte) -34);
                    break L2;
                  } else {
                    stackIn_9_0 = um.field_a;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (!this.field_j) {
                  stackIn_14_0 = g.field_k;
                  break L3;
                } else {
                  stackIn_14_0 = tg.field_d;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = g.field_k;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("kh.N(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    static {
    }
}
