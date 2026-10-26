/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um extends PcmStream {
    IntrusiveDeque field_k;
    static tk field_m;
    static boolean field_j;
    static String field_n;
    private MidiPcmStream field_l;
    PcmStreamMixer field_i;

    final void b(int[] param0, int param1, int param2) {
        String stackIn_16_2 = null;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          this.field_i.b(param0, param1, param2);
          ft var6 = (ft) (this.field_k.first(268435455));
          while (var6 != null) {
            boolean stackIn_4_0 = this.field_l.a(0, var6);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              int var5 = param2;
              int var4_int = param1;
              while (var5 > var6.field_i) {
                this.a(var6, (byte) 121, var6.field_i, var4_int + var5, param0, var4_int);
                var4_int = var4_int + var6.field_i;
                var5 = var5 - var6.field_i;
                if (this.field_l.a(var5, var4_int, false, var6, param0)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.a(var6, (byte) 120, var5, var5 + var4_int, param0, var4_int);
                var6.field_i = var6.field_i - var5;
              }
            }
            var6 = (ft) (this.field_k.next((byte) 103));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var4;
          StringBuilder stackIn_15_1 = new StringBuilder().append("um.M(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, ft param2) {
        String stackIn_18_2 = null;
        try {
          if (~(4 & this.field_l.field_G[param2.field_m]) != param0 &&
            0 > param2.field_p) {
            int var4_int = this.field_l.field_m[param2.field_m] / tk.field_f;
            int var5 = (var4_int + 1048575 - param2.field_t) / var4_int;
            param2.field_t = var4_int * param1 + param2.field_t & 1048575;
            if (var5 <= param1) {
              if (this.field_l.field_z[param2.field_m] != 0) {
                param2.field_e = PcmSampleStream.a(param2.field_x, param2.field_e.l(), 0, param2.field_e.g());
                MidiPcmStream stackIn_8_0 = this.field_l;
                ft stackIn_8_1 = (ft) (param2);
                boolean stackIn_9_2 = !(param2.field_y.field_n[param2.field_n] >= 0);
                ((MidiPcmStream) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_9_2, true);
              } else {
                param2.field_e = PcmSampleStream.a(param2.field_x, param2.field_e.l(), param2.field_e.i(), param2.field_e.g());
              }
              if (param2.field_y.field_n[param2.field_n] < 0) {
                param2.field_e.d(-1);
              }
              param1 = param2.field_t / var4_int;
            }
          }
          param2.field_e.a(param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var4;
          StringBuilder stackIn_17_1 = new StringBuilder().append("um.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final int d() {
        return 0;
    }

    final static s a(boolean param0, int param1) {
        int[] stackIn_23_0 = null;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        CipherPacketBuffer var8 = IntKeyLookup.incomingPacket;
        CipherPacketBuffer var2 = var8;
        int var3 = var8.readUnsignedByte(39);
        m.field_f = 127 & var3;
        boolean stackIn_3_0 = ((var3 & 128) != 0);
        sj.field_b = stackIn_3_0;
        km.field_b = var8.readUnsignedByte(-100);
        pe.field_g = var8.readLong((byte) 118);
        if (2 == m.field_f) {
          jt.field_t = var8.readUnsignedShort((byte) 0);
          ot.field_a = var8.readUnsignedMedium((byte) -92);
        } else {
          jt.field_t = 0;
          ot.field_a = 0;
        }
        int stackIn_9_0 = (param1 != var8.readUnsignedByte(-89)) ? 0 : 1;
        int var4 = stackIn_9_0;
        ku.field_g = var8.readNullTerminatedText(param1 - 17884);
        if (var4 != 0) {
          tn.field_t = var8.readNullTerminatedText(-17883);
        } else {
          tn.field_t = ku.field_g;
        }
        if (1 == m.field_f) {
          var8.readUnsignedShort((byte) 0);
          var8.readNullTerminatedText(-17883);
        } else {
          if (m.field_f == 4) {
            var8.readUnsignedShort((byte) 0);
            var8.readNullTerminatedText(-17883);
          }
        }
        if (!param0) {
          ep.field_x = ko.a(var8, 80, (byte) -114);
          ku.field_e = null;
          return new s(param0);
        }
        int var5 = var8.readUnsignedShort((byte) 0);
        try {
          jr var9 = uk.field_f.a(var5, -43);
          ep.field_x = var9.c((byte) 1);
          if (!tn.field_t.equals(fj.playerDisplayName)) {
            stackIn_23_0 = var9.field_t;
          } else {
            stackIn_23_0 = null;
          }
          ku.field_e = stackIn_23_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          Exception var6 = (Exception) (Object) decompiledCaughtException;
          v.a("CC1", (byte) -52, (Throwable) ((Object) var6));
          ku.field_e = null;
          ep.field_x = null;
          return new s(param0);
        }
        return new s(param0);
    }

    final PcmStream b() {
        ft var1 = (ft) (this.field_k.first(268435455));
        if (var1 == null) {
          return null;
        }
        if (var1.field_e != null) {
          return (PcmStream) ((Object) var1.field_e);
        }
        return this.a();
    }

    final void a(int param0) {
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        this.field_i.a(param0);
        ft var3 = (ft) (this.field_k.first(268435455));
        while (var3 != null) {
          boolean stackIn_4_0 = this.field_l.a(0, var3);
          boolean decompiledFrameCompleted0 = true;
          if (!stackIn_4_0) {
            int var2 = param0;
            while (var3.field_i < var2) {
              this.a(-1, var3.field_i, var3);
              var2 = var2 - var3.field_i;
              if (this.field_l.a(var2, 0, false, var3, (int[]) null)) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.a(-1, var2, var3);
              var3.field_i = var3.field_i - var2;
            }
          }
          var3 = (ft) (this.field_k.next((byte) 103));
        }
    }

    final PcmStream a() {
        ft var1_ref = null;
        int var2 = AceOfSkies.obfuscationControl ? 1 : 0;
        do {
          var1_ref = (ft) (this.field_k.next((byte) 103));
          if (var1_ref == null) {
            return null;
          }
        } while (null == var1_ref.field_e);
        return (PcmStream) ((Object) var1_ref.field_e);
    }

    public static void a(byte param0) {
        field_n = null;
        if (param0 <= 82) {
          return;
        }
        field_m = null;
    }

    final static void d(int param0) {
        int var1;
        int var2 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param0 == 1) {
          ss.field_t = false;
          uf.field_e = null;
          if (nf.field_a) {
            ml.field_m.l(88);
            return;
          }
          var1 = un.field_c;
          if (var1 > 0) {
            if (var1 == 1) {
              uf.field_e = qk.field_f;
            } else {
              uf.field_e = sn.a(field_n, 121, new String[]{Integer.toString(var1)});
            }
            uf.field_e = od.a(new CharSequence[]{(CharSequence) ((Object) uf.field_e), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) ne.field_f)}, 3);
          }
          ml.field_m.h((byte) 127);
          nj.c(98);
          return;
        }
        field_n = (String) null;
        ss.field_t = false;
        uf.field_e = null;
        if (nf.field_a) {
          ml.field_m.l(88);
        } else {
          var1 = un.field_c;
          if (var1 > 0) {
            if (var1 == 1) {
              uf.field_e = qk.field_f;
            } else {
              uf.field_e = sn.a(field_n, 121, new String[]{Integer.toString(var1)});
            }
            uf.field_e = od.a(new CharSequence[]{(CharSequence) ((Object) uf.field_e), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) ne.field_f)}, 3);
          }
          ml.field_m.h((byte) 127);
          nj.c(98);
        }
    }

    private final void a(ft param0, byte param1, int param2, int param3, int[] param4, int param5) {
        String stackIn_25_2 = null;
        String stackIn_28_2 = null;
        int var12 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if ((4 & this.field_l.field_G[param0.field_m]) != 0 &&
            param0.field_p < 0) {
            int var7_int = this.field_l.field_m[param0.field_m] / tk.field_f;
            while (true) {
              int var8 = (-param0.field_t + (var7_int + 1048575)) / var7_int;
              if (var8 > param2) {
                param0.field_t = param0.field_t + param2 * var7_int;
                break;
              }
              param0.field_e.b(param4, param5, var8);
              param2 = param2 - var8;
              param0.field_t = param0.field_t + (var7_int * var8 - 1048576);
              param5 = param5 + var8;
              int var9 = tk.field_f / 100;
              int var10 = 262144 / var7_int;
              if (var10 < var9) {
                var9 = var10;
              }
              PcmSampleStream var11 = param0.field_e;
              if (this.field_l.field_z[param0.field_m] != 0) {
                param0.field_e = PcmSampleStream.a(param0.field_x, var11.l(), 0, var11.g());
                MidiPcmStream stackIn_12_0 = this.field_l;
                ft stackIn_12_1 = (ft) (param0);
                boolean stackIn_13_2 = !(0 <= param0.field_y.field_n[param0.field_n]);
                ((MidiPcmStream) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_13_2, true);
                param0.field_e.d(var9, var11.i());
              } else {
                param0.field_e = PcmSampleStream.a(param0.field_x, var11.l(), var11.i(), var11.g());
              }
              if (0 > param0.field_y.field_n[param0.field_n]) {
                param0.field_e.d(-1);
              }
              var11.h(var9);
              var11.b(param4, param5, -param5 + param3);
              if (!var11.j()) {
                continue;
              }
              this.field_i.addSubstream(var11);
            }
          }
          int var7_intLifetime1 = -120 / ((35 - param1) / 48);
          param0.field_e.b(param4, param5, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_24_0 = var7;
          StringBuilder stackIn_24_1 = new StringBuilder().append("um.F(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          StringBuilder stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param5).append(')').toString());
        }
    }

    um(MidiPcmStream param0) {
        this.field_k = new IntrusiveDeque();
        this.field_i = new PcmStreamMixer();
        try {
          this.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "um.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = true;
        field_n = "You have <%0> unread messages!";
    }
}
