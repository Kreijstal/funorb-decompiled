/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static int field_g;
    static String field_e;
    static String field_k;
    static int field_c;
    static char field_i;
    static String field_h;
    private ms field_d;
    static int field_f;
    static boolean field_b;
    static String field_a;
    private ms field_j;

    final ms c(int param0) {
        ms var2 = this.field_j;
        if (var2 == this.field_d) {
          this.field_j = null;
          return null;
        }
        this.field_j = var2.field_s;
        if (param0 == 24) {
          return var2;
        }
        return (ms) null;
    }

    final static TileMetadata a(CipherPacketBuffer param0, int param1, int param2) {
        TileMetadata var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_2_0 = null;
        TileMetadata stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 == param1) {
            stackIn_2_0 = null;
            return (TileMetadata) (stackIn_2_0);
          }
          var3 = new TileMetadata();
          no.a(param0, var3, param1, -24721);
          var4 = -10 % ((param2 + 23) / 54);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("ui.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final ms b(int param0) {
        ms var2 = this.field_d.field_s;
        if (param0 != 11) {
          return (ms) null;
        }
        if (this.field_d != var2) {
          var2.c((byte) -76);
          return var2;
        }
        return null;
    }

    public static void d(int param0) {
        field_e = null;
        field_a = null;
        if (param0 <= 93) {
          return;
        }
        field_k = null;
        field_h = null;
    }

    final int a(int param0) {
        ms var3 = null;
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var2 = 0;
        ms var3Lifetime1;
        if (param0 == 30578) {
          var3 = this.field_d.field_s;
          while (this.field_d != var3) {
            var3 = var3.field_s;
            var2++;
          }
          return var2;
        }
        field_k = (String) null;
        var3Lifetime1 = this.field_d.field_s;
        while (this.field_d != var3Lifetime1) {
          var3Lifetime1 = var3Lifetime1.field_s;
          var2++;
        }
        return var2;
    }

    final void a(ms param0, boolean param1) {
        try {
          if (null != param0.field_l) {
            param0.c((byte) -76);
          }
          param0.field_s = this.field_d;
          if (param1) {
            field_i = '￠';
          }
          param0.field_l = this.field_d.field_l;
          param0.field_l.field_s = param0;
          param0.field_s.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ui.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final ms a(byte param0) {
        ms var2 = this.field_d.field_s;
        int var3 = 125 / ((param0 + 44) / 59);
        if (var2 != this.field_d) {
          this.field_j = var2.field_s;
          return var2;
        }
        this.field_j = null;
        return null;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_177_0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime1Lifetime1;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        stackIn_3_0 = (11 != sr.a(param3, -1 + param0, 11, (byte) -122)) ? 0 : 1;
        var5 = stackIn_3_0;
        stackIn_6_0 = (11 != sr.a(param3, param0 + 1, 11, (byte) -115)) ? 0 : 1;
        var6 = stackIn_6_0;
        stackIn_9_0 = (11 != sr.a(param3 + 1, param0, 11, (byte) -104)) ? 0 : 1;
        var7 = stackIn_9_0;
        stackIn_12_0 = (sr.a(param3 - 1, param0, 11, (byte) -94) != 11) ? 0 : 1;
        var8 = stackIn_12_0;
        var10 = -98 % ((11 - param2) / 40);
        var9 = 0;
        if (var5 != 0) {
          var9++;
        }
        if (var6 != 0) {
          var9++;
        }
        if (var7 != 0) {
          var9++;
        }
        if (var8 != 0) {
          var9++;
        }
        param4 -= 44;
        if (1 >= var9) {
          var11 = 1;
          if (var11 != 0) {
            if (var7 != 0) {
              l.field_b[30].a(param1, param4);
            }
            if (var5 != 0) {
              l.field_b[29].a(param1, param4);
            }
            l.field_b[24].a(param1, param4);
            if (var6 != 0) {
              l.field_b[27].a(param1, param4);
            }
            if (var8 != 0) {
              l.field_b[28].a(param1, param4);
            }
          } else {
            if (var7 != 0 &&
              var8 != 0) {
              l.field_b[26].a(param1, param4);
              return;
            }
            if (var5 != 0 &&
              var6 != 0) {
              l.field_b[25].a(param1, param4);
            }
          }
          return;
        }
        if (var5 != 0) {
          if (var7 != 0) {
            var11Lifetime1 = 1;
            if (var11Lifetime1 == 0) {
              if (var8 != 0) {
                l.field_b[26].a(param1, param4);
                return;
              }
              if (var6 == 0) {
                return;
              }
              l.field_b[25].a(param1, param4);
              return;
            }
            l.field_b[30].a(param1, param4);
            l.field_b[29].a(param1, param4);
            l.field_b[24].a(param1, param4);
            if (var6 != 0) {
              l.field_b[27].a(param1, param4);
            }
            if (var8 != 0) {
              l.field_b[28].a(param1, param4);
            }
            return;
          }
          if (var8 == 0) {
            if (var6 != 0) {
              stackIn_57_0 = (var8 != 0) ? 1 : 0;
            } else {
              stackIn_57_0 = 0;
            }
          } else {
            stackIn_57_0 = 1;
          }
          var11Lifetime1Lifetime1 = stackIn_57_0;
          if (var11Lifetime1Lifetime1 != 0) {
            l.field_b[29].a(param1, param4);
            l.field_b[24].a(param1, param4);
            if (var6 != 0) {
              l.field_b[27].a(param1, param4);
            }
            if (var8 != 0) {
              l.field_b[28].a(param1, param4);
            }
          } else {
            if (var6 != 0) {
              l.field_b[25].a(param1, param4);
            }
          }
          return;
        }
        if (var6 == 0) {
          var11Lifetime2 = 0;
          if (var11Lifetime2 == 0) {
            if (var7 != 0 &&
              var8 != 0) {
              l.field_b[26].a(param1, param4);
              return;
            }
            return;
          }
          if (var7 != 0) {
            l.field_b[30].a(param1, param4);
          } else {
          }
          l.field_b[24].a(param1, param4);
          if (var8 == 0) {
            return;
          }
          l.field_b[28].a(param1, param4);
          return;
        }
        if (var7 == 0) {
          stackIn_177_0 = (var8 == 0) ? 0 : 1;
          var11Lifetime3 = stackIn_177_0;
          if (var11Lifetime3 != 0) {
            l.field_b[24].a(param1, param4);
            l.field_b[27].a(param1, param4);
            if (var8 != 0) {
              l.field_b[28].a(param1, param4);
            }
          } else {
          }
          return;
        }
        var11Lifetime4 = 1;
        if (var11Lifetime4 == 0) {
          if (var8 != 0) {
            l.field_b[26].a(param1, param4);
            return;
          }
          return;
        }
        l.field_b[30].a(param1, param4);
        l.field_b[24].a(param1, param4);
        l.field_b[27].a(param1, param4);
        if (var8 != 0) {
          l.field_b[28].a(param1, param4);
        }
    }

    final static void a(byte param0, kl param1) {
        qs var2 = null;
        try {
          qs.a(param1.a("", 96, "headers.packvorbis"));
          var2 = qs.a(param1, "jagex logo2.packvorbis", "");
          if (param0 >= -102) {
            ui.a(-11, -82, (byte) 79, 117, -17);
          }
          var2.c();
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ui.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public ui() {
        this.field_d = new ms();
        this.field_d.field_l = this.field_d;
        this.field_d.field_s = this.field_d;
    }

    static {
        field_e = "Accept";
        field_h = "Username: ";
        field_k = "This unit cannot move";
        field_a = "Out of range";
    }
}
