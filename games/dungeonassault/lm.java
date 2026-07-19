/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

class lm extends ne {
    int field_y;
    static byte[][] field_l;
    boolean field_u;
    pg field_n;
    static String field_r;
    String field_w;
    int field_A;
    int field_j;
    int field_v;
    static int field_k;
    static int[] field_m;
    int field_x;
    l field_t;
    static String field_p;
    ca field_o;
    int field_q;
    int field_s;
    static cn field_z;
    String field_i;

    final static void b(byte param0) {
        try {
            IOException iOException = null;
            IOException var3_ref = null;
            int var1_int = 0;
            RuntimeException var1 = null;
            int var2 = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = DungeonAssault.field_K;
            try {
              L0: {
                L1: {
                  if (hb.field_a == null) {
                    break L1;
                  } else {
                    hb.field_a.a(-1016);
                    break L1;
                  }
                }
                L2: {
                  if (null != na.field_y) {
                    na.field_y.a(-65);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (null == sa.field_x) {
                    break L3;
                  } else {
                    try {
                      L4: {
                        sa.field_x.c((byte) -118);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        break L5;
                      }
                    }
                    break L3;
                  }
                }
                L6: {
                  var1_int = -105 / ((-8 - param0) / 61);
                  if (null != cf.field_c) {
                    var2 = 0;
                    L7: while (true) {
                      if (cf.field_c.length <= var2) {
                        break L6;
                      } else {
                        if (var4 == 0) {
                          L8: {
                            if (null == cf.field_c[var2]) {
                              break L8;
                            } else {
                              try {
                                L9: {
                                  cf.field_c[var2].c((byte) -42);
                                  break L9;
                                }
                              } catch (java.io.IOException decompiledCaughtParameter1) {
                                decompiledCaughtException = decompiledCaughtParameter1;
                                L10: {
                                  var3_ref = (IOException) (Object) decompiledCaughtException;
                                  break L10;
                                }
                              }
                              break L8;
                            }
                          }
                          var2++;
                          continue L7;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw vk.a((Throwable) ((Object) var1), "lm.VB(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        this.field_s = param4;
        this.field_v = param2;
        this.field_x = param1;
        if (param0 != 0) {
            return;
        }
        this.field_q = param3;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Object discarded$10 = null;
            Object discarded$11 = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = param1.getCodeBase();
                      var3 = j.a((byte) 116, var4, param1).getFile();
                      discarded$6 = ee.a("updatelinks", param1, param0 ^ -15735, new Object[]{"home", var3 + "home.ws"});
                      if (param0 == -106) {
                        break L2;
                      } else {
                        lm.a(true, (String) null, 27L, (java.applet.Applet) null, (String) null);
                        break L2;
                      }
                    }
                    discarded$7 = ee.a("updatelinks", param1, 15647, new Object[]{"gamelist", var3 + "togamelist.ws"});
                    discarded$8 = ee.a("updatelinks", param1, 15647, new Object[]{"serverlist", var3 + "toserverlist.ws"});
                    discarded$9 = ee.a("updatelinks", param1, 15647, new Object[]{"options", var3 + "options.ws"});
                    discarded$10 = ee.a("updatelinks", param1, 15647, new Object[]{"terms", var3 + "terms.ws"});
                    discarded$11 = ee.a("updatelinks", param1, 15647, new Object[]{"privacy", var3 + "privacy.ws"});
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref);
                stackOut_6_1 = new StringBuilder().append("lm.CC(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              throw vk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, lm param5, byte param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param6 == -84) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_j = -54;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var8);
            stackOut_4_1 = new StringBuilder().append("lm.GB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param5 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static void a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1 == -113) {
                break L1;
              } else {
                lm.a(true, (String) null, -94L, (java.applet.Applet) null, (String) null);
                break L1;
              }
            }
            L2: while (true) {
              if (ib.field_k <= var3_int) {
                break L0;
              } else {
                if (var4 == 0) {
                  L3: {
                    if (param0 == ue.field_j[var3_int]) {
                      ue.field_j[var3_int] = param2;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var3_int++;
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "lm.PB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, byte param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param3 < -76) {
                break L1;
              } else {
                this.field_t = (l) null;
                break L1;
              }
            }
            L2: {
              if (!this.a(param1, param0, -113, param2)) {
                break L2;
              } else {
                this.a(param0, param2, param1, 1);
                break L2;
              }
            }
            stackOut_4_0 = (StringBuilder) (param2);
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("lm.CB(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    boolean a(int param0, lm param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 == 34) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_q = 81;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("lm.H(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void f(int param0) {
        this.b(0, this.field_x, this.field_v, this.field_q, this.field_s);
        if (param0 == 12591) {
          return;
        } else {
          this.field_y = 64;
          return;
        }
    }

    final static void a(boolean param0, String param1, long param2, java.applet.Applet param3, String param4) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var8 = param3.getParameter("cookiehost");
                      var7 = var8;
                      var7 = var8;
                      if (!param0) {
                        break L2;
                      } else {
                        field_k = 1;
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        var7 = param1 + "=" + param4 + "; version=1; path=/; domain=" + var8;
                        if (param2 < 0L) {
                          break L4;
                        } else {
                          var7 = var7 + "; Expires=" + go.a(kd.c(-2456) + param2 * 1000L, -124) + "; Max-Age=" + param2;
                          if (DungeonAssault.field_K == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var7 = var7 + "; Discard;";
                      break L3;
                    }
                    ee.a("document.cookie=\"" + var7 + "\"", (byte) -46, param3);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var6 = decompiledCaughtException;
                    break L5;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) (var6_ref);
                stackOut_9_1 = new StringBuilder().append("lm.RB(").append(param0).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L6;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L6;
                }
              }
              L7: {
                stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param3 == null) {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L7;
                } else {
                  stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L7;
                }
              }
              L8: {
                stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param4 == null) {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L8;
                } else {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L8;
                }
              }
              throw vk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$1 = false;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        var4 = this.d(127);
        var5_int = 0;
        L0: while (true) {
          if (var4 < var5_int) {
            if (param2 != 452) {
              L1: {
                discarded$1 = this.a((lm) null, -108, -48, 123, 4, (byte) -62, -69);
                var5 = bk.b(param2 ^ 453);
                if (var5 != null) {
                  hl.field_a.a(var5, 6710886, fl.field_l, wa.field_c);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                var5 = bk.b(param2 ^ 453);
                if (var5 != null) {
                  hl.field_a.a(var5, 6710886, fl.field_l, wa.field_c);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          } else {
            this.a(var5_int, param1, 0, param0);
            var5_int++;
            if (var6 == 0) {
              continue L0;
            } else {
              L3: {
                var5 = bk.b(param2 ^ 453);
                if (var5 != null) {
                  hl.field_a.a(var5, 6710886, fl.field_l, wa.field_c);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          }
        }
    }

    public final String toString() {
        return this.a(0, new Hashtable(), new StringBuilder(), (byte) -89).toString();
    }

    lm(String param0, pg param1) {
        this(param0, hl.field_a.field_m, param1);
    }

    final boolean a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        Object discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var5_int = 120 / ((29 - param2) / 55);
            if (!param0.containsKey(this)) {
              discarded$4 = param0.put(this, this);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              discarded$5 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("lm.WB(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 == 0) {
          if (param0 == 0) {
            if (null != this.field_o) {
              this.field_o.a((byte) 34, (lm) (this), param1, param3, true);
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          lm.a((cn) null, (byte) 98);
          if (param0 == 0) {
            if (null == this.field_o) {
              return;
            } else {
              this.field_o.a((byte) 34, (lm) (this), param1, param3, true);
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void d(byte param0) {
        field_p = null;
        field_l = (byte[][]) null;
        if (param0 > -110) {
            return;
        }
        field_m = null;
        field_z = null;
        field_r = null;
    }

    String c(byte param0) {
        boolean discarded$9 = false;
        if (param0 > 3) {
          if (!this.field_u) {
            return null;
          } else {
            return this.field_i;
          }
        } else {
          discarded$9 = this.a(12, (lm) null);
          if (!this.field_u) {
            return null;
          } else {
            return this.field_i;
          }
        }
    }

    final boolean a(int param0, int param1, char param2) {
        int var4 = 0;
        if (this.a((byte) 117)) {
          if (!this.a((lm) (this), param2, param1, (byte) 63)) {
            var4 = param1;
            if ((var4 ^ -1) == -81) {
              return this.a(34, (lm) (this));
            } else {
              var4 = -107 % ((82 - param0) / 44);
              return false;
            }
          } else {
            return true;
          }
        } else {
          var4 = param1;
          if ((var4 ^ -1) == -81) {
            return this.a(34, (lm) (this));
          } else {
            var4 = -107 % ((82 - param0) / 44);
            return false;
          }
        }
    }

    final void a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              discarded$8 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_q).append(",").append(this.field_v).append(" ").append(this.field_x).append("x").append(this.field_s);
              if (this.field_w == null) {
                break L1;
              } else {
                discarded$9 = param1.append(" text=\"").append(this.field_w).append('"');
                break L1;
              }
            }
            L2: {
              if (!this.field_u) {
                break L2;
              } else {
                discarded$10 = param1.append(" mouseover");
                break L2;
              }
            }
            L3: {
              if (this.a((byte) 31)) {
                discarded$11 = param1.append(" focused");
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (this.field_o != null) {
                L5: {
                  discarded$12 = param1.append(" renderer=");
                  if (this.field_o instanceof lm) {
                    break L5;
                  } else {
                    discarded$13 = param1.append(this.field_o);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                param1 = this.a(1 + param0, param2, param1, (byte) -99);
                break L4;
              } else {
                break L4;
              }
            }
            if (param3 == 1) {
              L6: {
                if (this.field_n == null) {
                  break L6;
                } else {
                  L7: {
                    discarded$14 = param1.append(" listener=");
                    if (this.field_n instanceof lm) {
                      break L7;
                    } else {
                      discarded$15 = param1.append(this.field_n);
                      if (var6 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  param1 = this.a(1 + param0, param2, param1, (byte) -81);
                  break L6;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5);
            stackOut_22_1 = new StringBuilder().append("lm.DC(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    boolean a(lm param0, char param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param3 >= 55) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_t = (l) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("lm.W(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0 != 0;
    }

    void a(int param0, boolean param1, int param2, lm param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_y = 0;
              if (param1) {
                break L1;
              } else {
                this.field_i = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("lm.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 == -1) {
          if (param0 >= this.field_q + param1) {
            if (param2 - -this.field_v <= param4) {
              if (param1 + this.field_q - -this.field_x > param0) {
                if (param4 >= this.field_v + param2 - -this.field_s) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    boolean a(lm param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (this.a(param4, param3, param6, -1, param2)) {
                this.field_y = param1;
                break L1;
              } else {
                break L1;
              }
            }
            var8_int = -53 % ((-80 - param5) / 35);
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var8);
            stackOut_5_1 = new StringBuilder().append("lm.U(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_4_0 != 0;
    }

    int d(int param0) {
        int var2 = 115 % ((67 - param0) / 58);
        return 0;
    }

    final static void a(cn param0, byte param1) {
        try {
            ie.a(116);
            gf.a(param0.field_B, param0.field_E, param0.field_G);
            int var2_int = -127 / ((param1 - -38) / 37);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "lm.BC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(int param0, int param1, lm param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            var5_int = this.a(hj.field_S, param0, param1, -1, eh.field_h) ? 1 : 0;
            if (param3) {
              L1: {
                if (var5_int != (this.field_u ? 1 : 0)) {
                  L2: {
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var5_int == 0) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((lm) (this)).field_u = stackIn_7_1 != 0;
                  if (null == this.field_n) {
                    break L1;
                  } else {
                    if (this.field_n instanceof de) {
                      ((de) ((Object) this.field_n)).a(true, (lm) (this), var5_int != 0);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("lm.B(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    void e(int param0) {
        if (param0 >= 1) {
            return;
        }
        String discarded$0 = this.toString();
    }

    final boolean a(int param0, byte param1, int param2, boolean param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        int var5 = 0;
        oi var6 = null;
        int var7 = 0;
        oi var8 = null;
        oi var11 = null;
        oi var16 = null;
        oi var21 = null;
        oi var22 = null;
        oi var24 = null;
        oi var26 = null;
        oi var27 = null;
        oi var28 = null;
        oi var29 = null;
        oi var30 = null;
        var7 = DungeonAssault.field_K;
        if (param1 == 66) {
          this.a(param2, param0, (lm) (this), true);
          var5 = this.a((byte) 95) ? 1 : 0;
          if (param3) {
            L0: {
              if (0 == pj.field_r) {
                break L0;
              } else {
                if (var5 != 0) {
                  discarded$4 = this.a(param2, param0, hj.field_S, pj.field_r, eh.field_h, (lm) (this), (byte) -84);
                  break L0;
                } else {
                  L1: {
                    if (-1 == (no.field_d ^ -1)) {
                      break L1;
                    } else {
                      if (this.a((lm) (this), no.field_d, hm.field_k, param2, lc.field_c, (byte) 0, param0)) {
                        param3 = false;
                        break L1;
                      } else {
                        if (var5 == 0) {
                          break L1;
                        } else {
                          this.e(127);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            L2: {
                              param3 = false;
                              if (0 != la.field_g) {
                                break L2;
                              } else {
                                if (oe.field_i != 0) {
                                  this.a(param0, true, eh.field_h, (lm) (this), param2, hj.field_S);
                                  var27 = ah.field_b;
                                  var6 = var27;
                                  if (var27 == null) {
                                    break L2;
                                  } else {
                                    L3: {
                                      if (var27.field_n instanceof qo) {
                                        ((qo) ((Object) var27.field_n)).a((bj) null, var27, false);
                                        break L3;
                                      } else {
                                        break L3;
                                      }
                                    }
                                    ah.field_b = null;
                                    break L2;
                                  }
                                } else {
                                  oe.field_i = la.field_g;
                                  nk.a(this.c((byte) 34), (byte) 23);
                                  return param3;
                                }
                              }
                            }
                            oe.field_i = la.field_g;
                            nk.a(this.c((byte) 34), (byte) 23);
                            return param3;
                          }
                        }
                      }
                    }
                  }
                  L4: {
                    if (0 != la.field_g) {
                      break L4;
                    } else {
                      if (oe.field_i != 0) {
                        this.a(param0, true, eh.field_h, (lm) (this), param2, hj.field_S);
                        var28 = ah.field_b;
                        if (var28 == null) {
                          break L4;
                        } else {
                          L5: {
                            if (var28.field_n instanceof qo) {
                              ((qo) ((Object) var28.field_n)).a((bj) null, var28, false);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          ah.field_b = null;
                          break L4;
                        }
                      } else {
                        oe.field_i = la.field_g;
                        nk.a(this.c((byte) 34), (byte) 23);
                        return param3;
                      }
                    }
                  }
                  oe.field_i = la.field_g;
                  nk.a(this.c((byte) 34), (byte) 23);
                  return param3;
                }
              }
            }
            L6: {
              if (-1 == (no.field_d ^ -1)) {
                break L6;
              } else {
                if (this.a((lm) (this), no.field_d, hm.field_k, param2, lc.field_c, (byte) 0, param0)) {
                  param3 = false;
                  break L6;
                } else {
                  if (var5 == 0) {
                    break L6;
                  } else {
                    this.e(127);
                    if (var7 == 0) {
                      break L6;
                    } else {
                      L7: {
                        param3 = false;
                        if (0 != la.field_g) {
                          break L7;
                        } else {
                          if (oe.field_i != 0) {
                            this.a(param0, true, eh.field_h, (lm) (this), param2, hj.field_S);
                            var29 = ah.field_b;
                            if (var29 == null) {
                              break L7;
                            } else {
                              L8: {
                                if (var29.field_n instanceof qo) {
                                  ((qo) ((Object) var29.field_n)).a((bj) null, var29, false);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              ah.field_b = null;
                              break L7;
                            }
                          } else {
                            oe.field_i = la.field_g;
                            nk.a(this.c((byte) 34), (byte) 23);
                            return param3;
                          }
                        }
                      }
                      oe.field_i = la.field_g;
                      nk.a(this.c((byte) 34), (byte) 23);
                      return param3;
                    }
                  }
                }
              }
            }
            L9: {
              if (0 != la.field_g) {
                break L9;
              } else {
                if (oe.field_i != 0) {
                  this.a(param0, true, eh.field_h, (lm) (this), param2, hj.field_S);
                  var30 = ah.field_b;
                  if (var30 == null) {
                    break L9;
                  } else {
                    L10: {
                      if (var30.field_n instanceof qo) {
                        ((qo) ((Object) var30.field_n)).a((bj) null, var30, false);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    ah.field_b = null;
                    break L9;
                  }
                } else {
                  oe.field_i = la.field_g;
                  nk.a(this.c((byte) 34), (byte) 23);
                  return param3;
                }
              }
            }
            oe.field_i = la.field_g;
            nk.a(this.c((byte) 34), (byte) 23);
            return param3;
          } else {
            if (var5 != 0) {
              if (no.field_d != 0) {
                this.e(23);
                if (var7 != 0) {
                  L11: {
                    if (0 == pj.field_r) {
                      break L11;
                    } else {
                      if (var5 != 0) {
                        discarded$5 = this.a(param2, param0, hj.field_S, pj.field_r, eh.field_h, (lm) (this), (byte) -84);
                        break L11;
                      } else {
                        L12: {
                          if (-1 == (no.field_d ^ -1)) {
                            break L12;
                          } else {
                            L13: {
                              if (this.a((lm) (this), no.field_d, hm.field_k, param2, lc.field_c, (byte) 0, param0)) {
                                break L13;
                              } else {
                                if (var5 == 0) {
                                  break L12;
                                } else {
                                  this.e(127);
                                  break L13;
                                }
                              }
                            }
                            param3 = false;
                            break L12;
                          }
                        }
                        if (0 == la.field_g) {
                          if (oe.field_i != 0) {
                            L14: {
                              this.a(param0, true, eh.field_h, (lm) (this), param2, hj.field_S);
                              var22 = ah.field_b;
                              var6 = var22;
                              if (var22 == null) {
                                break L14;
                              } else {
                                L15: {
                                  if (var22.field_n instanceof qo) {
                                    ((qo) ((Object) var22.field_n)).a((bj) null, var22, false);
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                                ah.field_b = null;
                                break L14;
                              }
                            }
                            oe.field_i = la.field_g;
                            nk.a(this.c((byte) 34), (byte) 23);
                            return param3;
                          } else {
                            oe.field_i = la.field_g;
                            nk.a(this.c((byte) 34), (byte) 23);
                            return param3;
                          }
                        } else {
                          oe.field_i = la.field_g;
                          nk.a(this.c((byte) 34), (byte) 23);
                          return param3;
                        }
                      }
                    }
                  }
                  L16: {
                    if (-1 == (no.field_d ^ -1)) {
                      break L16;
                    } else {
                      if (this.a((lm) (this), no.field_d, hm.field_k, param2, lc.field_c, (byte) 0, param0)) {
                        param3 = false;
                        break L16;
                      } else {
                        if (var5 == 0) {
                          break L16;
                        } else {
                          this.e(127);
                          if (var7 == 0) {
                            break L16;
                          } else {
                            param3 = false;
                            if (0 == la.field_g) {
                              if (oe.field_i == 0) {
                                oe.field_i = la.field_g;
                                nk.a(this.c((byte) 34), (byte) 23);
                                return param3;
                              } else {
                                L17: {
                                  this.a(param0, true, eh.field_h, (lm) (this), param2, hj.field_S);
                                  var24 = ah.field_b;
                                  var6 = var24;
                                  if (var24 == null) {
                                    break L17;
                                  } else {
                                    L18: {
                                      if (var24.field_n instanceof qo) {
                                        ((qo) ((Object) var24.field_n)).a((bj) null, var24, false);
                                        break L18;
                                      } else {
                                        break L18;
                                      }
                                    }
                                    ah.field_b = null;
                                    break L17;
                                  }
                                }
                                oe.field_i = la.field_g;
                                nk.a(this.c((byte) 34), (byte) 23);
                                return param3;
                              }
                            } else {
                              oe.field_i = la.field_g;
                              nk.a(this.c((byte) 34), (byte) 23);
                              return param3;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (0 == la.field_g) {
                    if (oe.field_i != 0) {
                      L19: {
                        this.a(param0, true, eh.field_h, (lm) (this), param2, hj.field_S);
                        var26 = ah.field_b;
                        if (var26 == null) {
                          break L19;
                        } else {
                          L20: {
                            if (var26.field_n instanceof qo) {
                              ((qo) ((Object) var26.field_n)).a((bj) null, var26, false);
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          ah.field_b = null;
                          break L19;
                        }
                      }
                      oe.field_i = la.field_g;
                      nk.a(this.c((byte) 34), (byte) 23);
                      return param3;
                    } else {
                      oe.field_i = la.field_g;
                      nk.a(this.c((byte) 34), (byte) 23);
                      return param3;
                    }
                  } else {
                    oe.field_i = la.field_g;
                    nk.a(this.c((byte) 34), (byte) 23);
                    return param3;
                  }
                } else {
                  oe.field_i = la.field_g;
                  nk.a(this.c((byte) 34), (byte) 23);
                  return param3;
                }
              } else {
                oe.field_i = la.field_g;
                nk.a(this.c((byte) 34), (byte) 23);
                return param3;
              }
            } else {
              oe.field_i = la.field_g;
              nk.a(this.c((byte) 34), (byte) 23);
              return param3;
            }
          }
        } else {
          this.field_A = -58;
          this.a(param2, param0, (lm) (this), true);
          var5 = this.a((byte) 95) ? 1 : 0;
          if (!param3) {
            if (var5 != 0) {
              if (no.field_d != 0) {
                this.e(23);
                if (var7 != 0) {
                  L21: {
                    if (0 == pj.field_r) {
                      break L21;
                    } else {
                      if (var5 != 0) {
                        discarded$6 = this.a(param2, param0, hj.field_S, pj.field_r, eh.field_h, (lm) (this), (byte) -84);
                        break L21;
                      } else {
                        L22: {
                          if (-1 == (no.field_d ^ -1)) {
                            break L22;
                          } else {
                            L23: {
                              if (this.a((lm) (this), no.field_d, hm.field_k, param2, lc.field_c, (byte) 0, param0)) {
                                break L23;
                              } else {
                                if (var5 == 0) {
                                  break L22;
                                } else {
                                  this.e(127);
                                  break L23;
                                }
                              }
                            }
                            param3 = false;
                            break L22;
                          }
                        }
                        if (0 == la.field_g) {
                          if (oe.field_i == 0) {
                            oe.field_i = la.field_g;
                            nk.a(this.c((byte) 34), (byte) 23);
                            return param3;
                          } else {
                            L24: {
                              this.a(param0, true, eh.field_h, (lm) (this), param2, hj.field_S);
                              var11 = ah.field_b;
                              if (var11 == null) {
                                break L24;
                              } else {
                                L25: {
                                  if (var11.field_n instanceof qo) {
                                    ((qo) ((Object) var11.field_n)).a((bj) null, var11, false);
                                    break L25;
                                  } else {
                                    break L25;
                                  }
                                }
                                ah.field_b = null;
                                break L24;
                              }
                            }
                            oe.field_i = la.field_g;
                            nk.a(this.c((byte) 34), (byte) 23);
                            return param3;
                          }
                        } else {
                          oe.field_i = la.field_g;
                          nk.a(this.c((byte) 34), (byte) 23);
                          return param3;
                        }
                      }
                    }
                  }
                  L26: {
                    if (-1 == (no.field_d ^ -1)) {
                      break L26;
                    } else {
                      if (this.a((lm) (this), no.field_d, hm.field_k, param2, lc.field_c, (byte) 0, param0)) {
                        param3 = false;
                        break L26;
                      } else {
                        if (var5 == 0) {
                          break L26;
                        } else {
                          this.e(127);
                          if (var7 == 0) {
                            break L26;
                          } else {
                            param3 = false;
                            if (0 == la.field_g) {
                              if (oe.field_i == 0) {
                                oe.field_i = la.field_g;
                                nk.a(this.c((byte) 34), (byte) 23);
                                return param3;
                              } else {
                                L27: {
                                  this.a(param0, true, eh.field_h, (lm) (this), param2, hj.field_S);
                                  var16 = ah.field_b;
                                  if (var16 == null) {
                                    break L27;
                                  } else {
                                    L28: {
                                      if (var16.field_n instanceof qo) {
                                        ((qo) ((Object) var16.field_n)).a((bj) null, var16, false);
                                        break L28;
                                      } else {
                                        break L28;
                                      }
                                    }
                                    ah.field_b = null;
                                    break L27;
                                  }
                                }
                                oe.field_i = la.field_g;
                                nk.a(this.c((byte) 34), (byte) 23);
                                return param3;
                              }
                            } else {
                              oe.field_i = la.field_g;
                              nk.a(this.c((byte) 34), (byte) 23);
                              return param3;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (0 == la.field_g) {
                    if (oe.field_i != 0) {
                      L29: {
                        this.a(param0, true, eh.field_h, (lm) (this), param2, hj.field_S);
                        var21 = ah.field_b;
                        if (var21 == null) {
                          break L29;
                        } else {
                          L30: {
                            if (var21.field_n instanceof qo) {
                              ((qo) ((Object) var21.field_n)).a((bj) null, var21, false);
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          ah.field_b = null;
                          break L29;
                        }
                      }
                      oe.field_i = la.field_g;
                      nk.a(this.c((byte) 34), (byte) 23);
                      return param3;
                    } else {
                      oe.field_i = la.field_g;
                      nk.a(this.c((byte) 34), (byte) 23);
                      return param3;
                    }
                  } else {
                    oe.field_i = la.field_g;
                    nk.a(this.c((byte) 34), (byte) 23);
                    return param3;
                  }
                } else {
                  oe.field_i = la.field_g;
                  nk.a(this.c((byte) 34), (byte) 23);
                  return param3;
                }
              } else {
                oe.field_i = la.field_g;
                nk.a(this.c((byte) 34), (byte) 23);
                return param3;
              }
            } else {
              oe.field_i = la.field_g;
              nk.a(this.c((byte) 34), (byte) 23);
              return param3;
            }
          } else {
            L31: {
              if (0 == pj.field_r) {
                break L31;
              } else {
                if (var5 != 0) {
                  discarded$7 = this.a(param2, param0, hj.field_S, pj.field_r, eh.field_h, (lm) (this), (byte) -84);
                  break L31;
                } else {
                  break L31;
                }
              }
            }
            L32: {
              if (-1 == (no.field_d ^ -1)) {
                break L32;
              } else {
                L33: {
                  if (this.a((lm) (this), no.field_d, hm.field_k, param2, lc.field_c, (byte) 0, param0)) {
                    break L33;
                  } else {
                    if (var5 == 0) {
                      break L32;
                    } else {
                      this.e(127);
                      if (var7 == 0) {
                        break L32;
                      } else {
                        break L33;
                      }
                    }
                  }
                }
                param3 = false;
                break L32;
              }
            }
            if (0 == la.field_g) {
              if (oe.field_i == 0) {
                oe.field_i = la.field_g;
                nk.a(this.c((byte) 34), (byte) 23);
                return param3;
              } else {
                L34: {
                  this.a(param0, true, eh.field_h, (lm) (this), param2, hj.field_S);
                  var8 = ah.field_b;
                  var6 = var8;
                  if (var8 == null) {
                    break L34;
                  } else {
                    L35: {
                      if (var8.field_n instanceof qo) {
                        ((qo) ((Object) var8.field_n)).a((bj) null, var8, false);
                        break L35;
                      } else {
                        break L35;
                      }
                    }
                    ah.field_b = null;
                    break L34;
                  }
                }
                oe.field_i = la.field_g;
                nk.a(this.c((byte) 34), (byte) 23);
                return param3;
              }
            } else {
              oe.field_i = la.field_g;
              nk.a(this.c((byte) 34), (byte) 23);
              return param3;
            }
          }
        }
    }

    protected lm() {
        this.field_A = 0;
        this.field_j = 0;
    }

    boolean a(byte param0) {
        if (param0 <= 6) {
            this.a(42, 36, -17);
            return false;
        }
        return false;
    }

    lm(String param0, ca param1, pg param2) {
        RuntimeException runtimeException = null;
        th var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        this.field_A = 0;
        this.field_j = 0;
        try {
          L0: {
            L1: {
              this.field_n = param2;
              this.field_o = param1;
              this.field_w = param0;
              if (!(this.field_o instanceof th)) {
                break L1;
              } else {
                var4 = (th) ((Object) this.field_o);
                this.field_x = var4.a(82, (lm) (this));
                this.field_s = var4.a((lm) (this), 8);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (runtimeException);
            stackOut_4_1 = new StringBuilder().append("lm.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    lm(int param0, int param1, int param2, int param3, ca param4, pg param5) {
        this.field_A = 0;
        this.field_j = 0;
        try {
            this.field_s = param3;
            this.field_x = param2;
            this.field_o = param4;
            this.field_n = param5;
            this.field_v = param1;
            this.field_q = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "lm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Dryad";
        field_l = new byte[50][];
        field_p = "Type your password again to make sure it's correct";
        field_m = new int[8192];
    }
}
