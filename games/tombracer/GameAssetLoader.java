/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GameAssetLoader implements LoadingStage {
    static boolean field_t;
    private boolean field_c;
    private ResourceArchive field_g;
    private ResourceArchive field_p;
    private ResourceArchive field_e;
    private ResourceArchive field_m;
    private static String[] field_v;
    private ResourceArchive field_j;
    private ResourceArchive field_o;
    private ResourceArchive field_k;
    private ResourceArchive field_d;
    private ResourceArchive field_f;
    private ResourceArchive field_h;
    static String field_i;
    private ResourceArchive field_q;
    private ResourceArchive field_a;
    private ResourceArchive field_b;
    static String[] connectingTranslations;
    private boolean field_n;
    private ResourceArchive field_s;
    private ResourceArchive field_l;
    private ResourceArchive field_r;

    public final void openArchives(byte param0) {
        if (null != ConstrainToFacingArcLocomotor.field_v) {
          pfa.loadLocalizedText(ConstrainToFacingArcLocomotor.field_v, param0 + 157);
          ConstrainToFacingArcLocomotor.field_v = null;
          C2SActionPacket.a(-33);
        }
        this.field_h = SoftReferenceCache.openArchive(16, param0 ^ -37);
        this.field_q = SoftReferenceCache.openArchive(17, param0 ^ -37);
        this.field_p = SoftReferenceCache.openArchive(18, param0 + 39);
        this.field_j = SoftReferenceCache.openArchive(19, 1);
        this.field_g = SoftReferenceCache.openArchive(20, 1);
        this.field_f = SoftReferenceCache.openArchive(21, 1);
        this.field_a = SoftReferenceCache.openArchive(22, param0 + 39);
        this.field_r = SoftReferenceCache.openArchive(23, 1);
        this.field_m = SoftReferenceCache.openArchive(24, 1);
        this.field_k = SoftReferenceCache.openArchive(26, 1);
        this.field_l = SoftReferenceCache.openArchive(27, 1);
        this.field_o = SoftReferenceCache.openArchive(28, 1);
        this.field_b = SoftReferenceCache.openArchive(29, 1);
        this.field_d = SoftReferenceCache.openArchive(30, 1);
        this.field_s = SoftReferenceCache.openArchive(C2SActionPacket.field_i.field_c, 1);
        if (param0 != -38) {
          return;
        }
        this.field_e = SoftReferenceCache.openArchive(kn.field_j.field_c, param0 ^ -37);
        ResourceArchive var6 = PitComponent.field_G;
        ResourceArchive var7 = var6;
        ResourceArchive var3 = ota.field_b;
        ina dupTemp$0 = new ina(55);
        lba.field_r = dupTemp$0;
        ina var4 = dupTemp$0;
        var4.a(256, this.field_k, fv.loadingQuipsAlternate[0], Player.loadingQuips[0]);
        var4.a(256, this.field_l, fv.loadingQuipsAlternate[1], Player.loadingQuips[1]);
        var4.a(256, this.field_o, fv.loadingQuipsAlternate[2], Player.loadingQuips[2]);
        var4.a(256, this.field_b, fv.loadingQuipsAlternate[3], Player.loadingQuips[3]);
        var4.a(256, this.field_h, fv.loadingQuipsAlternate[4], Player.loadingQuips[4]);
        var4.a(param0 ^ -294, this.field_p, fv.loadingQuipsAlternate[5], Player.loadingQuips[5]);
        var4.a(256, this.field_s, fv.loadingQuipsAlternate[6], Player.loadingQuips[6]);
        var4.a(Player.loadingQuips[7], (byte) -36, "basic", var7, fv.loadingQuipsAlternate[7]);
        var4.a(Player.loadingQuips[8], (byte) -36, "lobby", var7, fv.loadingQuipsAlternate[8]);
        var4.a(Player.loadingQuips[9], (byte) -36, "lobby", var3, fv.loadingQuipsAlternate[9]);
        var4.a(256, this.field_d, fv.loadingQuipsAlternate[10], Player.loadingQuips[10]);
        var4.a(256, this.field_e, fv.loadingQuipsAlternate[11], Player.loadingQuips[11]);
        var4.a(256, this.field_q, fv.loadingQuipsAlternate[12], Player.loadingQuips[12]);
        var4.a(256, this.field_r, fv.loadingQuipsAlternate[13], Player.loadingQuips[13]);
        var4.a(256, this.field_m, fv.loadingQuipsAlternate[14], Player.loadingQuips[14]);
        var4.a(param0 + 294, this.field_j, fv.loadingQuipsAlternate[15], Player.loadingQuips[15]);
        var4.a(256, this.field_f, fv.loadingQuipsAlternate[16], Player.loadingQuips[16]);
        var4.a(param0 ^ -294, this.field_g, fv.loadingQuipsAlternate[17], Player.loadingQuips[17]);
        var4.a(param0 ^ -294, this.field_a, fv.loadingQuipsAlternate[18], Player.loadingQuips[18]);
    }

    final static String[][] a(byte param0, PacketBuffer param1) {
        int var5 = 0;
        IntrusiveDeque var2 = null;
        RuntimeException var2_ref = null;
        String[][] var3 = null;
        int var4 = 0;
        int var6 = 0;
        String[][] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var2 = new IntrusiveDeque();
          while (param1.position < param1.payload.length) {
            var2.addLast((byte) -72, new gba(pe.a(param1, (byte) 73)));
          }
          var3 = new String[var2.size((byte) -16)][];
          var4 = -92 / ((param0 + 9) / 51);
          for (var5 = 0; var3.length > var5; var5++) {
            var3[var5] = ((gba) (var2.removeFirst(44))).field_g;
          }
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("sra.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, String param2) {
        try {
          if (param1 != 47) {
            this.field_e = (ResourceArchive) null;
          }
          ima.a((float)param0, param2, -106);
          ad.field_j.draw(0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sra.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0) {
        int var2;
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = 5 / ((55 - param0) / 58);
        if (this.field_e != null) {
          RoomComponent.a(1048576, new kra(this.field_e.a("", (byte) 113, "huffman")));
          this.field_e = null;
          C2SActionPacket.a(-33);
          return;
        }
        if (this.field_d != null) {
          SpriteState.a(-18035);
          this.a(30, (byte) 47, uba.loadingQuipsShort[0]);
          Transform3D.a(this.field_d, 17572);
          uo.b((byte) -125);
          this.field_d = null;
          C2SActionPacket.a(-33);
          return;
        }
        if (this.field_h != null &&
          null != this.field_p) {
          fp.a(uba.loadingQuipsShort[1], 40, this.field_h, (byte) 17);
          TextLayout.a((byte) -105, this.field_p, 50, uba.loadingQuipsShort[2]);
          this.field_p = null;
          KeySwitchComponent.a((byte) -86, uba.loadingQuipsShort[3], this.field_q, this.field_h, 60);
          this.a(65, (byte) 47, uba.loadingQuipsShort[4]);
          dqa.a(this.field_r, this.field_m, (byte) 55, this.field_h);
          this.a(70, (byte) 47, uba.loadingQuipsShort[5]);
          this.d(-10242);
          this.a(75, (byte) 47, uba.loadingQuipsShort[6]);
          this.field_r = null;
          this.field_m = null;
          this.field_h = null;
          C2SActionPacket.a(-33);
          return;
        }
        if (this.field_j != null) {
          ui.a(this.field_j, uba.loadingQuipsShort[7], 80, -79);
          this.field_j = null;
          C2SActionPacket.a(-33);
          return;
        }
        if (null != this.field_f) {
          nfa.a(this.field_f, uba.loadingQuipsShort[8], false, 90, this.field_g, this.field_a);
          this.field_g = null;
          this.field_a = null;
          this.field_f = null;
          C2SActionPacket.a(-33);
          return;
        }
        if (this.field_k != null &&
          this.field_l != null &&
          this.field_b != null &&
          this.field_o != null) {
          sb.a(-70, this.field_k, this.field_o, this.field_l, this.field_b);
          for (var3 = 0; 237 > var3; var3++) {
            fea.a(false, var3);
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < 4; var3Lifetime1++) {
            paa.a(false, var3Lifetime1);
          }
          ab.field_n.field_y.e(0);
          this.field_o = null;
          this.field_k = null;
          this.field_l = null;
          this.field_b = null;
          return;
        }
        if (baa.field_d == null) {
          this.a(95, (byte) 47, uba.loadingQuipsShort[9]);
          FleeLocomotor.e((byte) -33);
          baa.field_d = new di(MatchPhase.field_l, rc.field_a);
        }
        LaserShooterComponent.D(17229);
        if (null == baa.field_d.field_i) {
          return;
        }
        this.field_c = true;
    }

    public final boolean a(int param0) {
        if (!this.field_n &&
          HotspotTextWidget.b(false)) {
          this.field_n = true;
        }
        if (param0 > -124) {
          this.field_a = (ResourceArchive) null;
        }
        return this.field_n;
    }

    final static String a(String param0, int param1) {
        try {
          int var4_int = 0;
          int var3 = 0;
          int var5_int = 0;
          int var8 = 0;
          BitPacketBuffer var9 = null;
          String stackIn_11_0 = null;
          String stackIn_16_0 = null;
          String stackIn_18_0 = null;
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2 = null;
          Exception var4 = null;
          Object var4_ref = null;
          Exception var5 = null;
          int var6 = 0;
          int var7 = 0;
          BitPacketBuffer var11 = null;
          esa var12 = null;
          byte[] var15 = null;
          var8 = TombRacer.field_G ? 1 : 0;
          try {
            var9 = new BitPacketBuffer(128);
            var9.position = var9.position + 2;
            var3 = var9.position;
            var9.beginBitWrite(8);
            try {
              for (var4_int = 0; param0.length() > var4_int; var4_int++) {
                var5_int = param0.charAt(var4_int);
                if (!Character.isWhitespace((char) var5_int)) {
                  var6 = Character.digit((char) var5_int, 16);
                  var9.j(var6, 4);
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (Exception) (Object) decompiledCaughtException;
              var4.printStackTrace();
              stackIn_11_0 = "Unable to pack " + param0;
              return stackIn_11_0;
            }
            var9.endBitWrite(-1826190686);
            var9.backpatchShortLength(-var3 + var9.position, (byte) 109);
            var9.position = 0;
            var4_ref = null;
            try {
              var15 = ssa.a(var9, -26, true);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
              var5.printStackTrace();
              stackIn_16_0 = "funorb profile threw Exception";
              return stackIn_16_0;
            }
            var11 = new BitPacketBuffer(var15);
            var12 = new esa();
            var7 = -101 % ((-14 - param1) / 49);
            var6 = var11.readUnsignedByte(255);
            dga.a(var11, 0);
            var12.a(var11, var6, (byte) 39);
            mq.field_e = var12.a(79);
            f.field_e = var12.b((byte) -78);
            toa.field_j = true;
            stackIn_18_0 = "profile loaded";
            return stackIn_18_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var2;
            stackIn_21_1 = new StringBuilder().append("sra.G(");
            if (param0 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final boolean b(int param0) {
        rg.e(-2339);
        PlatformComponent.A(67);
        if (!this.field_c) {
          this.c(124);
          return false;
        }
        C2SActionPacket.a(-33);
        if (param0 != -4171) {
          return true;
        }
        return true;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -35) {
          connectingTranslations = (String[]) null;
        }
        connectingTranslations = null;
        field_v = null;
        field_i = null;
    }

    public final void b(byte param0) {
        CoinItemComponent.a(cq.field_d, (byte) 52);
        hd.a(50, param0 ^ -78);
        wm.field_a = null;
        hb.field_t = (GameScreen) ((Object) nl.a(0, (byte) 50));
        ima.a(100.0f, uba.loadingQuipsShort[10], param0 ^ 115);
        ad.field_j.draw(param0 ^ -49);
        gn.field_C.a(-19216);
        if (param0 != -49) {
          this.c(-107);
        }
        cla.f(0);
        C2SActionPacket.a(param0 + 16);
        if (null != mq.field_e) {
          eda.a(mq.field_e.field_g, true);
        }
    }

    private final void d(int param0) {
        int var4 = 0;
        Sprite[] array$0 = null;
        int var5 = 0;
        int incrementValue$1 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        Sprite[][] var2 = new Sprite[haa.field_C.length][];
        int var3 = 0;
        for (var4 = 0; haa.field_C.length > var4; var4++) {
          array$0 = new Sprite[haa.field_C[var4].length];
          var2[var4] = array$0;
          for (var5 = 0; var5 < haa.field_C[var4].length; var5++) {
            incrementValue$1 = var3;
            var3++;
            var2[var4][var5] = bp.field_m[incrementValue$1];
          }
        }
        if (param0 != -10242) {
          this.b((byte) 30);
        }
        if (!dna.field_G) {
          dea.field_c = false;
          FullscreenConfirmationDialog.a(this.field_s, 10, MirrorMoverLocomotor.field_o, fr.field_b, PitComponent.field_G, MouseWheelInput.field_a, 4, var2, true, 2, via.field_c, ota.field_b, jf.field_t, mga.field_f, var2);
          cq.field_d = qw.field_f;
          tda.a(200, (byte) -71);
          fta.field_b = MatchState.field_p;
        }
    }

    GameAssetLoader() {
        this.field_c = false;
    }

    static {
        field_v = new String[6];
        field_v[3] = "Key";
        field_v[0] = "Coin";
        field_v[2] = "Idol";
        field_v[4] = "Gun";
        field_v[1] = "Coinbag";
        field_v[5] = "Powerup: Misc";
        connectingTranslations = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_i = "Return to game";
    }
}
