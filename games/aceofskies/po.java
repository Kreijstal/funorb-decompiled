/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po extends ka {
    private am field_f;
    private int field_g;
    private am field_b;
    private am field_k;
    static RenderSprite[] powerIconSprites;
    private int field_d;
    private am field_c;
    static int activeMenuId;
    static int field_j;
    private ms field_i;

    final static void a(fp param0, byte param1, int param2) {
        try {
          CipherPacketBuffer var3 = q.outgoingPacket;
          var3.writeCipheredOpcode(127, param2);
          if (param1 < 19) {
            activeMenuId = -122;
          }
          var3.writeByte(-1336879960, param0.field_f);
          var3.writeShort(param0.field_e, 23385);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "po.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static SoundPlayback a(int param0, int param1, PcmSample param2) {
        String stackIn_8_2 = null;
        try {
          if (param1 != 0) {
            SoundPlayback stackIn_2_0 = (SoundPlayback) null;
            return stackIn_2_0;
          }
          SoundPlayback var3 = jo.a(param2, param0, (byte) -44);
          var3.field_g.d(-1);
          SoundPlayback stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var3_ref;
          StringBuilder stackIn_7_1 = new StringBuilder().append("po.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static String a(int param0, CharSequence param1, boolean param2) {
        String stackIn_17_2 = null;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param0 != -1) {
            po.c(126);
          }
          String var3 = ls.a(param1, param2, (byte) 21);
          if (var3 != null) {
            String stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          int var4 = 0;
          while (true) {
            if (param1.length() <= var4) {
              return null;
            }
            if (cg.a(param1.charAt(var4), (byte) 118)) {
              var4++;
              continue;
            }
            break;
          }
          String stackIn_11_0 = wi.field_b;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var3_ref;
          StringBuilder stackIn_16_1 = new StringBuilder().append("po.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            int var2_int = -51 % ((param1 + 49) / 53);
            try {
              java.net.URL var3 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
              param0.getAppletContext().showDocument(jf.a(param0, var3, -53), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Exception var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_7_0 = var2;
            StringBuilder stackIn_7_1 = new StringBuilder().append("po.C(");
            if (param0 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0) {
        if (null != this.field_c) {
          this.field_c.a(true);
          if (null != this.field_b) {
            this.field_b.a(true);
          }
          if (null != this.field_k) {
            this.field_k.a(true);
          }
          if (null != this.field_f) {
            this.field_f.a(true);
          }
          if (param0 != 0) {
            CharSequence var3 = (CharSequence) null;
            po.a(-108, (CharSequence) null, true);
          }
          if (null != this.field_i) {
            this.field_i.b((byte) 29);
          }
          return;
        }
        if (null != this.field_b) {
          this.field_b.a(true);
        }
        if (null != this.field_k) {
          this.field_k.a(true);
        }
        if (null != this.field_f) {
          this.field_f.a(true);
        }
        if (param0 == 0) {
          if (null != this.field_i) {
            this.field_i.b((byte) 29);
          }
          return;
        }
        CharSequence var3Lifetime1 = (CharSequence) null;
        po.a(-108, (CharSequence) null, true);
        if (null != this.field_i) {
          this.field_i.b((byte) 29);
        }
        return;
    }

    public static void c(int param0) {
        powerIconSprites = null;
        if (param0 != -30534) {
          activeMenuId = 87;
        }
    }

    po(bf param0, int param1, int param2, boolean param3, boolean param4) {
        String stackIn_20_2 = null;
        try {
          this.field_d = param2;
          this.field_g = param1;
          if (param3 ||
            tt.a(this.field_g, true, this.field_d)) {
            this.field_c = new am(cu.a((byte) 117, this.field_g, this.field_d));
          }
          if (param3 ||
            ta.a(this.field_g, this.field_d, (byte) 91)) {
            this.field_b = new am(av.a(22847, this.field_d, this.field_g));
          }
          if (param3 ||
            si.a(this.field_d, 2, this.field_g)) {
            this.field_k = new am(hi.c(14834, this.field_g, this.field_d));
          }
          if (param3 ||
            ScoreSubmission.a(0, this.field_d, this.field_g)) {
            this.field_f = new am(ln.a(17, this.field_g, this.field_d));
          }
          if (!param3 &&
            !la.a(this.field_d, this.field_g, (byte) 21)) {
            return;
          }
          this.field_i = new ms(hs.a(true, this.field_g, this.field_d));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var6;
          StringBuilder stackIn_19_1 = new StringBuilder().append("po.<init>(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
