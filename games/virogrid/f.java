/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class f implements Iterator {
    private wb field_a;
    static km[] field_f;
    static ml field_j;
    private eb field_e;
    static String field_d;
    private wb field_i;
    static km field_c;
    static String field_g;
    static int field_b;
    static String field_h;

    final static String a(int param0) {
        if (param0 != 8) {
            f.a((byte) -24);
        }
        if (!(pa.field_l != ao.field_Kb)) {
            return ea.field_e;
        }
        return wd.field_d;
    }

    final static int a(int param0, int param1, int param2, int param3, byte[] param4, CharSequence param5) {
        int stackIn_3_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var6_int = param0 - param3;
            if (param2 <= -120) {
              var7 = 0;
              L1: while (true) {
                if (var6_int <= var7) {
                  stackIn_70_0 = var6_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        var8 = param5.charAt(var7 + param3);
                        if (var8 <= 0) {
                          break L4;
                        } else {
                          if (var8 < 128) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (160 > var8) {
                          break L5;
                        } else {
                          if (var8 > 255) {
                            break L5;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (var8 == 8364) {
                        param4[param1 + var7] = (byte)-128;
                        break L2;
                      } else {
                        if (8218 == var8) {
                          param4[param1 + var7] = (byte)-126;
                          break L2;
                        } else {
                          if (var8 == 402) {
                            param4[param1 + var7] = (byte)-125;
                            break L2;
                          } else {
                            if (var8 == 8222) {
                              param4[param1 + var7] = (byte)-124;
                              break L2;
                            } else {
                              if (var8 != 8230) {
                                if (8224 != var8) {
                                  if (var8 != 8225) {
                                    if (var8 != 710) {
                                      if (var8 == 8240) {
                                        param4[param1 - -var7] = (byte)-119;
                                        break L2;
                                      } else {
                                        if (var8 != 352) {
                                          if (var8 != 8249) {
                                            if (338 == var8) {
                                              param4[param1 + var7] = (byte)-116;
                                              break L2;
                                            } else {
                                              if (var8 != 381) {
                                                if (var8 == 8216) {
                                                  param4[param1 - -var7] = (byte)-111;
                                                  break L2;
                                                } else {
                                                  if (var8 != 8217) {
                                                    if (var8 != 8220) {
                                                      if (var8 != 8221) {
                                                        if (8226 != var8) {
                                                          if (var8 != 8211) {
                                                            if (var8 != 8212) {
                                                              if (732 == var8) {
                                                                param4[var7 + param1] = (byte)-104;
                                                                break L2;
                                                              } else {
                                                                if (var8 != 8482) {
                                                                  if (var8 != 353) {
                                                                    if (8250 == var8) {
                                                                      param4[var7 + param1] = (byte)-101;
                                                                      break L2;
                                                                    } else {
                                                                      if (var8 == 339) {
                                                                        param4[param1 - -var7] = (byte)-100;
                                                                        break L2;
                                                                      } else {
                                                                        if (var8 == 382) {
                                                                          param4[param1 - -var7] = (byte)-98;
                                                                          break L2;
                                                                        } else {
                                                                          if (376 == var8) {
                                                                            param4[param1 - -var7] = (byte)-97;
                                                                            break L2;
                                                                          } else {
                                                                            param4[param1 - -var7] = (byte)63;
                                                                            break L2;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    param4[param1 - -var7] = (byte)-102;
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  param4[param1 - -var7] = (byte)-103;
                                                                  break L2;
                                                                }
                                                              }
                                                            } else {
                                                              param4[param1 - -var7] = (byte)-105;
                                                              break L2;
                                                            }
                                                          } else {
                                                            param4[param1 + var7] = (byte)-106;
                                                            break L2;
                                                          }
                                                        } else {
                                                          param4[param1 - -var7] = (byte)-107;
                                                          break L2;
                                                        }
                                                      } else {
                                                        param4[param1 - -var7] = (byte)-108;
                                                        break L2;
                                                      }
                                                    } else {
                                                      param4[param1 + var7] = (byte)-109;
                                                      break L2;
                                                    }
                                                  } else {
                                                    param4[param1 + var7] = (byte)-110;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                param4[var7 + param1] = (byte)-114;
                                                break L2;
                                              }
                                            }
                                          } else {
                                            param4[var7 + param1] = (byte)-117;
                                            break L2;
                                          }
                                        } else {
                                          param4[param1 - -var7] = (byte)-118;
                                          break L2;
                                        }
                                      }
                                    } else {
                                      param4[var7 + param1] = (byte)-120;
                                      break L2;
                                    }
                                  } else {
                                    param4[param1 - -var7] = (byte)-121;
                                    break L2;
                                  }
                                } else {
                                  param4[param1 + var7] = (byte)-122;
                                  break L2;
                                }
                              } else {
                                param4[param1 - -var7] = (byte)-123;
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                    param4[param1 - -var7] = (byte)var8;
                    break L2;
                  }
                  var7++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 107;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_73_0 = (RuntimeException) (var6);

            stackIn_73_1 = new StringBuilder().append("f.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L6;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_76_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');

            if (param5 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L7;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L7;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_74_0), stackIn_77_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_70_0;
        }
    }

    final static void a(byte param0) {
        ac.field_e = false;
        if (!(dk.field_v == null)) {
            dk.field_v.h(1026);
        }
        if (!(sd.field_e == 0)) {
            re.c((byte) 121);
        }
        if (param0 > -26) {
            f.b((byte) -19);
        }
        bf.field_o = 0;
    }

    public final Object next() {
        Object var1 = this.field_a;
        if (this.field_e.field_e != var1) {
            this.field_a = ((wb) (var1)).field_h;
        } else {
            this.field_a = null;
            var1 = null;
        }
        this.field_i = (wb) (var1);
        return var1;
    }

    final static boolean b(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == -844) {
            break L0;
          } else {
            field_d = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!mi.a((byte) -119)) {
              break L2;
            } else {
              if (-1 != (8 & id.field_r ^ -1)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    public final boolean hasNext() {
        return this.field_a != this.field_e.field_e;
    }

    public static void b(byte param0) {
        field_h = null;
        field_c = null;
        field_d = null;
        int var1 = 57 / ((47 - param0) / 48);
        field_j = null;
        field_f = null;
        field_g = null;
    }

    f(eb param0) {
        this.field_i = null;
        try {
            this.field_e = param0;
            this.field_a = this.field_e.field_e.field_h;
            this.field_i = null;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "f.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(char param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = Virogrid.field_F ? 1 : 0;
        if (param2 >= -3) {
            field_c = (km) null;
        }
        char[] var6 = new char[param1];
        char[] var3 = var6;
        for (var4 = 0; var4 < param1; var4++) {
            var6[var4] = param0;
        }
        return new String(var6);
    }

    public final void remove() {
        if (this.field_i == null) {
            throw new IllegalStateException();
        }
        this.field_i.c(25);
        this.field_i = null;
    }

    static {
        field_g = "RuneScape clan";
        field_d = "Set up new game";
        field_h = "Hide lobby chat";
    }
}
