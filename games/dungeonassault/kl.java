/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kl {
    static String field_e;
    boolean field_d;
    static String field_b;
    int field_j;
    md field_f;
    private ph field_g;
    static String[] field_c;
    int field_k;
    int field_a;
    static gd field_h;
    int field_i;
    ph field_l;

    private final void c(boolean param0) {
        rj var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((kl) this).field_a = 126;
                break L1;
              }
            }
            qe.a(((kl) this).field_g, ((kl) this).field_k, ((kl) this).field_j, ((kl) this).field_a, ((kl) this).field_i);
            ((kl) this).field_g.h(((kl) this).field_k, ((kl) this).field_j);
            var2 = (rj) (Object) ((kl) this).field_f.e(-24172);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var2) {
                    break L4;
                  } else {
                    var2.d(0);
                    var2 = (rj) (Object) ((kl) this).field_f.a(4);
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2_ref, "kl.CA(" + param0 + ')');
        }
    }

    kl(int param0, int param1, int param2, int param3) {
        this();
        try {
            ((kl) this).a(param1, param2, param0, -23241, param3);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "kl.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((kl) this).field_i = param4;
              ((kl) this).field_j = param0;
              ((kl) this).field_a = param1;
              ((kl) this).field_k = param2;
              ((kl) this).b((byte) 37);
              nm.field_ib = new int[((kl) this).field_i * ((kl) this).field_a];
              if (param3 == -23241) {
                break L1;
              } else {
                ((kl) this).a(true);
                break L1;
              }
            }
            ((kl) this).field_g = new ph(new cn(((kl) this).field_a, ((kl) this).field_i), new cn(((kl) this).field_a, ((kl) this).field_i));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var6, "kl.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    void b(byte param0) {
        RuntimeException var2 = null;
        int[] var2_array = null;
        int var3_int = 0;
        cn var3 = null;
        int[] var4 = null;
        cn var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            var2_array = new int[64];
            var3_int = 0;
            L1: while (true) {
              L2: {
                if (64 <= var3_int) {
                  break L2;
                } else {
                  var2_array[var3_int] = mp.a(-2147483648, 65793 * (24 - -var3_int));
                  var3_int++;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = te.a(((kl) this).field_a, ((kl) this).field_i, var2_array, 16, 8, 0.125);
              if (param0 == 37) {
                var4 = te.b(((kl) this).field_a, ((kl) this).field_i, 0.125);
                var5 = new cn(0, 0);
                var5.field_v = ((kl) this).field_i;
                var5.field_B = var4;
                var5.field_y = ((kl) this).field_a;
                ((kl) this).field_l = new ph(var3, var5);
                jh.a(((kl) this).field_l);
                ke.a(-101, 0, ((kl) this).field_i, 0);
                ke.a(21, ((kl) this).field_a + -8, ((kl) this).field_i, 0);
                un.a(8, (byte) -127, ((kl) this).field_a - 16, 0, true);
                un.a(8, (byte) 50, ((kl) this).field_a - 16, ((kl) this).field_i - 8, true);
                qe.a(8, 8, -16 + ((kl) this).field_a, ((kl) this).field_i + -16, 224, 32, 7, 128);
                jh.b();
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "kl.B(" + param0 + ')');
        }
    }

    void a(boolean param0) {
        try {
            eg.a(((kl) this).field_f, true);
            if (param0) {
                field_c = null;
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "kl.A(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        try {
            field_b = null;
            field_c = null;
            field_e = null;
            field_h = null;
            if (param0 <= 42) {
                String discarded$0 = kl.a((CharSequence) null, (byte) 88);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "kl.V(" + param0 + ')');
        }
    }

    void c(int param0) {
        rj var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param0 <= -115) {
                break L1;
              } else {
                ((kl) this).field_i = -43;
                break L1;
              }
            }
            var2 = (rj) (Object) ((kl) this).field_f.e(-24172);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var2) {
                    break L4;
                  } else {
                    var2.b((byte) 30);
                    var2 = (rj) (Object) ((kl) this).field_f.a(4);
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2_ref, "kl.AA(" + param0 + ')');
        }
    }

    kl(int param0, int param1) {
        this();
        try {
            ((kl) this).a(param0, 0, param1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "kl.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    void c(byte param0) {
        try {
            int var2_int = -121 % ((-34 - param0) / 57);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "kl.J(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        try {
            ((kl) this).a(-param2 + 480 >> 1577417377, param0, 640 - param0 >> -1060136639, -23241, param2);
            if (param1 != 0) {
                ((kl) this).b(-9);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "kl.DA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0) {
        rj var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              jh.a(((kl) this).field_g);
              if (param0 <= -12) {
                break L1;
              } else {
                ((kl) this).field_g = null;
                break L1;
              }
            }
            ((kl) this).field_l.b(0, 0);
            var2 = (rj) (Object) ((kl) this).field_f.e(-24172);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var2) {
                    break L4;
                  } else {
                    var2.a(-((kl) this).field_k, -((kl) this).field_j, (byte) -96);
                    var2 = (rj) (Object) ((kl) this).field_f.a(4);
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                jh.b();
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2_ref, "kl.W(" + param0 + ')');
        }
    }

    void b(int param0) {
        try {
            int var2_int = -91 / ((param0 - 41) / 63);
            this.c(false);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "kl.F(" + param0 + ')');
        }
    }

    void b(boolean param0) {
        try {
            if (param0) {
                ((kl) this).field_g = null;
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "kl.N(" + param0 + ')');
        }
    }

    final static String a(CharSequence param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2_int = -121 % ((param1 - 36) / 62);
              var3 = uj.a(ci.a(param0, 2), -1);
              if (null != var3) {
                break L1;
              } else {
                var3 = "";
                break L1;
              }
            }
            stackOut_2_0 = (String) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("kl.BA(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public kl() {
        try {
            ((kl) this).field_f = new md();
            ((kl) this).field_d = false;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "kl.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Renown gained: ";
        field_c = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_b = "Glamour";
    }
}
