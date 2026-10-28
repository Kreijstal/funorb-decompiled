/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SelfDestructEffects {
    static boolean field_k;
    static boolean field_s;
    static String field_d;
    static Js5Transport field_j;
    static int field_q;
    static boolean field_n;
    static Sprite field_b;
    private IntrusiveDeque field_o;
    private int field_a;
    private int field_m;
    private TrackerMusicDefinition field_e;
    private int field_g;
    private int field_r;
    private Sprite field_l;
    private int field_h;
    private GameplaySession field_f;
    private Random field_i;
    private int field_c;
    private int field_p;

    private final void a(boolean param0, int param1, int param2) {
        int var6 = EscapeVector.obfuscationControl;
        if (this.field_o.isEmpty(-98)) {
          return;
        }
        IntrusiveNode var4 = this.field_o.first(false);
        while (var4 != null) {
          PointCloudEffect var5 = (PointCloudEffect) (var4);
          var5.a(99, param2, param1);
          var4 = this.field_o.next((byte) 70);
        }
        if (!param0) {
          java.awt.Component var7 = (java.awt.Component) null;
          SelfDestructEffects.a((java.awt.Component) null, (byte) -120);
        }
    }

    final static void f(int param0) {
        int var5 = EscapeVector.obfuscationControl;
        try {
          int var1_int = al.field_f[0];
          int var3 = -128 % ((param0 + 36) / 48);
          for (int var2 = 1; al.field_f.length > var2; var2++) {
            int var4 = al.field_f[var2];
            qg.a(bc.field_f, var2 << 4, bc.field_f, var1_int, var4);
            var1_int = var1_int + var4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "od.B(" + param0 + ')');
        }
    }

    private final void a(byte param0) {
        this.field_l = new Sprite(this.field_m, this.field_m);
        int[] var8 = new int[4];
        int[] var2 = var8;
        SoftwareRasterizer.a(var8);
        this.field_l.g();
        int var3 = this.field_m / 2;
        int var4 = this.field_m / 2;
        int var5 = this.field_m / 2;
        int var6 = 1;
        SoftwareRasterizer.d(var3, var4, var5, var6);
        if (md.field_D != null) {
          md.field_D.a(125);
        }
        int var7 = -25 / ((param0 + 25) / 58);
        SoftwareRasterizer.b(var8);
    }

    final static void b(int param0) {
        if (param0 != 2) {
          java.awt.Component var2 = (java.awt.Component) null;
          SelfDestructEffects.a((java.awt.Component) null, (byte) -63);
        }
        dj.a(0, -14, 0);
    }

    private final int a(boolean param0, int param1) {
        int var4 = EscapeVector.obfuscationControl;
        int var3 = this.field_f.worldWidth;
        while (param1 < 0) {
          param1 = param1 + var3;
        }
        while (var3 <= param1) {
          param1 = param1 - var3;
        }
        if (param0) {
          this.a(-66);
        }
        return param1;
    }

    private final void a(int param0) {
        int var2 = 640;
        int var3 = 480;
        if (param0 > -99) {
          this.field_i = (Random) null;
        }
        int var4 = (this.field_f.shipXQ16 >> 16) - var2 / 2;
        int var5 = (this.field_f.shipYQ16 >> 16) - var3 / 2;
        int var6 = this.a(var2, 1) + var4;
        var6 = this.a(false, var6);
        int var7 = this.a(var3, 1) + var5;
        if (var7 < 0) {
          var7 = 0;
        }
        int var8 = this.field_f.worldHeight;
        if (var7 >= var8) {
          var7 = -this.field_l.fullHeight + (-1 + var8);
        }
        PcmSample var9 = sf.field_e[0];
        PointCloudEffect var10 = new PointCloudEffect(this.field_l, var6, var7, var9);
        this.field_o.addLast(-12328, var10);
    }

    final static int a(byte param0, boolean param1, String param2, sn param3, sn param4, int param5, int param6) {
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        String stackIn_68_2 = null;
        String stackIn_71_2 = null;
        String stackIn_74_2 = null;
        int var9 = 0;
        int var13 = EscapeVector.obfuscationControl;
        try {
          String var14 = param4.a(-106);
          String var8 = param3.a(-78);
          if (param0 != -32) {
            field_s = false;
          }
          if (null == TextLayout.field_c &&
            !sl.a(false, (byte) 0)) {
            int stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (al.field_d == sf.field_d) {
            DialWidgetPainter.field_g = null;
            QuickChatDynamicCommand.outgoingPackets.position = 0;
            if (param2 != null) {
              var9 = 0;
              qj.field_a.position = 0;
              if (param1) {
                var9 = var9 | 1;
              }
              qj.field_a.writeInt((byte) 123, gk.field_a.nextInt());
              qj.field_a.writeInt((byte) 124, gk.field_a.nextInt());
              qj.field_a.writeCircumfixedString((byte) 100, var14);
              qj.field_a.writeCircumfixedString((byte) 100, var8);
              CharSequence var15 = (CharSequence) ((Object) param2);
              qj.field_a.writeCircumfixedString((byte) 100, mm.a(0, var15));
              qj.field_a.writeShort(-116, param5);
              qj.field_a.writeByte(param6, -123);
              qj.field_a.writeByte(var9, -123);
              QuickChatDynamicCommand.outgoingPackets.writeByte(18, param0 ^ 101);
              QuickChatDynamicCommand.outgoingPackets.position = QuickChatDynamicCommand.outgoingPackets.position + 2;
              int var10 = QuickChatDynamicCommand.outgoingPackets.position;
              String var11_ref_String = tf.a(-1, PointCloudEffect.d((byte) -110));
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              QuickChatDynamicCommand.outgoingPackets.writeString(var11_ref_String, 105);
              bn.a(param0 ^ -32, QuickChatDynamicCommand.outgoingPackets, qj.field_a, MarkerSlider.field_O, cf.field_c);
              QuickChatDynamicCommand.outgoingPackets.backpatchShortLength(QuickChatDynamicCommand.outgoingPackets.position - var10, 32614);
            } else {
              qj.field_a.position = 0;
              qj.field_a.writeInt((byte) 124, gk.field_a.nextInt());
              qj.field_a.writeInt((byte) 127, gk.field_a.nextInt());
              PacketBuffer stackIn_12_0 = qj.field_a;
              int stackIn_12_1 = 100;
              if (!param4.b(114)) {
                stackIn_13_2 = "";
              } else {
                stackIn_13_2 = var14;
              }
              ((PacketBuffer) (Object) stackIn_12_0).writeCircumfixedString((byte) stackIn_12_1, stackIn_13_2);
              PacketBuffer stackIn_15_0 = qj.field_a;
              int stackIn_15_1 = 100;
              if (param3.b(88)) {
                stackIn_16_2 = var8;
              } else {
                stackIn_16_2 = "";
              }
              ((PacketBuffer) (Object) stackIn_15_0).writeCircumfixedString((byte) stackIn_15_1, stackIn_16_2);
              QuickChatDynamicCommand.outgoingPackets.writeByte(16, -123);
              QuickChatDynamicCommand.outgoingPackets.position = QuickChatDynamicCommand.outgoingPackets.position + 1;
              var9 = QuickChatDynamicCommand.outgoingPackets.position;
              bn.a(0, QuickChatDynamicCommand.outgoingPackets, qj.field_a, MarkerSlider.field_O, cf.field_c);
              QuickChatDynamicCommand.outgoingPackets.backpatchByteLength(-38, -var9 + QuickChatDynamicCommand.outgoingPackets.position);
            }
            ClientException.a(-1, 30785);
            al.field_d = IntrusiveDeque.field_a;
          }
          if (IntrusiveDeque.field_a == al.field_d &&
            bo.a(30000, 1)) {
            int var9Lifetime1 = QuickChatDynamicCommand.incomingPackets.readUnsignedByte(0);
            QuickChatDynamicCommand.incomingPackets.position = 0;
            if (100 <= var9Lifetime1 &&
              var9Lifetime1 <= 105) {
              jf.field_I = new String[-100 + var9Lifetime1];
              al.field_d = ResourceArchive.field_k;
            } else {
              if (var9Lifetime1 == 248) {
                se.writeBrowserSessionMarker((byte) 81, PointCloudEffect.d((byte) -108));
                MouseWheelInput.field_a = w.field_fb;
                nm.a(param0 ^ -16);
                e.field_c = false;
                int stackIn_34_0 = var9Lifetime1;
                return stackIn_34_0;
              }
              if (var9Lifetime1 == 99) {
                bo.a(30000, uc.b(92));
                DialWidgetPainter.field_g = new Boolean(SecondaryIntrusiveDeque.a(QuickChatDynamicCommand.incomingPackets, true));
                QuickChatDynamicCommand.incomingPackets.position = 0;
              } else {
                EmailSyntaxValidator.field_r = -1;
                cd.field_v = var9Lifetime1;
                al.field_d = mh.field_h;
              }
            }
          }
          if (al.field_d == ResourceArchive.field_k) {
            int var9Lifetime2 = 2;
            if (bo.a(param0 + 30032, var9Lifetime2)) {
              int var10Lifetime1 = QuickChatDynamicCommand.incomingPackets.readUnsignedShort(param0 + 1984);
              QuickChatDynamicCommand.incomingPackets.position = 0;
              if (bo.a(param0 + 30032, var10Lifetime1)) {
                int var11 = jf.field_I.length;
                for (int var12 = 0; var12 < var11; var12++) {
                  jf.field_I[var12] = QuickChatDynamicCommand.incomingPackets.readCircumfixedString((byte) 125);
                }
                nm.a(16);
                e.field_c = false;
                int stackIn_44_0 = var11 + 100;
                return stackIn_44_0;
              }
            }
          }
          if (al.field_d == mh.field_h &&
            ArchiveKeyRequest.hasCompletePacket(param0 ^ -10538)) {
            if (cd.field_v != 255) {
              MouseWheelInput.field_a = QuickChatDynamicCommand.incomingPackets.readString(false);
            } else {
              String var9_ref_String = QuickChatDynamicCommand.incomingPackets.readNullableString(param0 - 15176);
              if (var9_ref_String != null) {
                GameKeyHandler.a(var9_ref_String, (byte) 30, PointCloudEffect.d((byte) -83));
              }
            }
            nm.a(16);
            e.field_c = false;
            int stackIn_53_0 = cd.field_v;
            return stackIn_53_0;
          }
          if (TextLayout.field_c == null) {
            if (e.field_c) {
              if (30000L < un.e(64655)) {
                MouseWheelInput.field_a = DualLinkNode.field_l;
              } else {
                MouseWheelInput.field_a = wk.field_a;
              }
              e.field_c = false;
              int stackIn_61_0 = 249;
              return stackIn_61_0;
            }
            int var9Lifetime3 = ej.field_b;
            ej.field_b = sj.field_i;
            sj.field_i = var9Lifetime3;
            e.field_c = true;
          }
          int stackIn_64_0 = -1;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_67_0 = var7;
          StringBuilder stackIn_67_1 = new StringBuilder().append("od.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          StringBuilder stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param3 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          StringBuilder stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param4 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void c(int param0) {
        this.a(true);
        if (!this.field_f.countdownActive) {
          return;
        }
        int var2 = this.field_f.countdownTicks;
        if (this.field_g >= var2) {
          this.field_e = wc.field_d;
          this.field_r = 64;
        }
        if (this.field_p < var2) {
          return;
        }
        var2 = -var2 + this.field_p;
        if (param0 == ~(var2 % this.field_h)) {
          this.a(-110);
        }
        this.e(50);
        var2 = this.field_f.countdownTicks;
        if (this.field_c >= var2) {
          this.field_a = this.field_a + 1;
        }
        if (this.field_c < this.field_a) {
          this.field_a = this.field_c;
        }
        if (1 == this.field_a) {
          PcmStreamMixer var3 = pl.field_n;
          PcmSample var4 = RasterBuffer.field_c;
          int var5 = 100;
          int var6 = IterableNodeHashTable.field_c * 6144 / 64;
          int var7 = 8192;
          var3.playSampleWithPan(var4, var5, var6, var7);
        }
    }

    private final void e(int param0) {
        Object var3 = null;
        int var4 = EscapeVector.obfuscationControl;
        if (this.field_o.isEmpty(-120)) {
          return;
        }
        IntrusiveNode var2 = this.field_o.first(false);
        if (param0 != 50) {
          this.field_m = 75;
        }
        while (var2 != null) {
          PointCloudEffect var3_ref = (PointCloudEffect) (var2);
          var3_ref.a();
          var2 = this.field_o.next((byte) 70);
        }
        var2 = this.field_o.first(false);
        while (var2 != null) {
          PointCloudEffect var3_refLifetime1 = (PointCloudEffect) (var2);
          if (var3_refLifetime1.field_B) {
            var3_refLifetime1.unlink((byte) -119);
            break;
          }
          var2 = this.field_o.next((byte) 70);
        }
    }

    private final int a(int param0, int param1) {
        long var3 = (long)this.field_i.nextInt();
        if (var3 < 0L) {
          var3 = -var3;
        }
        var3 = (long)(param0 - param1) * var3 / 2147483647L;
        return (int)var3;
    }

    final void a(byte param0, int param1, int param2) {
        this.a(true, param2, param1);
        if (param0 != -87) {
          this.b(true);
        }
        if (this.field_a <= 0) {
          return;
        }
        int var4 = 256;
        int var5 = this.field_a * var4 / this.field_c;
        int var6 = 640;
        int var7 = 480;
        int var8 = 16777215;
        SoftwareRasterizer.a(0, 0, var6, var7, var8, var5);
    }

    final TrackerMusicDefinition b(boolean param0) {
        if (!param0) {
          field_d = (String) null;
        }
        return this.field_e;
    }

    private final void a(boolean param0) {
        boolean var2 = (this.field_f.countdownActive);
        int var3 = this.field_f.countdownTicks;
        var2 = ((var3 > this.field_g)) & var2;
        if (!param0) {
          int discarded$0 = this.a(false, 28);
        }
        int var4 = IterableNodeHashTable.field_c * 6144 / 64;
        int var5 = 8192;
        if (!var2) {
          var4 = 0;
          var5 = 0;
        }
        PcmSampleStream var6 = this.field_f.field_lc;
        if (var6 == null) {
          return;
        }
        var6.setVolumeAndPanQ6(var4, var5);
    }

    final int c(boolean param0) {
        if (!param0) {
          this.field_m = -125;
        }
        return this.field_r;
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
          param0.removeMouseListener(QuickChatDynamicCommand.mouseHandler);
          param0.removeMouseMotionListener(QuickChatDynamicCommand.mouseHandler);
          int var2_int = 100 % ((-57 - param1) / 62);
          param0.removeFocusListener(QuickChatDynamicCommand.mouseHandler);
          vj.heldMouseButton = 0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "od.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int guard) {
        field_d = null;
        field_j = null;
        field_b = null;
        if (guard != -12548) {
          field_d = (String) null;
        }
    }

    SelfDestructEffects(GameplaySession param0) {
        this.field_o = new IntrusiveDeque();
        this.field_g = 1500;
        this.field_r = -1;
        this.field_m = 32;
        this.field_p = 500;
        this.field_h = 50;
        this.field_e = null;
        this.field_c = 50;
        try {
          this.field_f = param0;
          this.a((byte) 110);
          int var2_int = (int)td.b(128);
          this.field_i = new Random((long)var2_int);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "od.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = false;
        field_n = false;
        field_q = -1;
    }
}
