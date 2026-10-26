/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pe implements Iterator {
    static HighscoreNameEntry[] highscoreNameEntries;
    private lc field_e;
    private IntrusiveNode field_f;
    private IntrusiveNode field_d;
    private int field_a;
    static String field_c;
    static long field_g;

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            stackIn_2_0 = (Class) null;
            return stackIn_2_0;
          }
          if (param0.equals("B")) {
            stackIn_6_0 = Byte.TYPE;
            return stackIn_6_0;
          }
          if (param0.equals("I")) {
            stackIn_9_0 = Integer.TYPE;
            return stackIn_9_0;
          }
          if (param0.equals("S")) {
            stackIn_13_0 = Short.TYPE;
            return stackIn_13_0;
          }
          if (param0.equals("J")) {
            stackIn_16_0 = Long.TYPE;
            return stackIn_16_0;
          }
          if (param0.equals("Z")) {
            stackIn_20_0 = Boolean.TYPE;
            return stackIn_20_0;
          }
          if (param0.equals("F")) {
            stackIn_24_0 = Float.TYPE;
            return stackIn_24_0;
          }
          if (param0.equals("D")) {
            stackIn_27_0 = Double.TYPE;
            return stackIn_27_0;
          }
          if (!param0.equals("C")) {
            return Class.forName(param0);
          }
          stackIn_31_0 = Character.TYPE;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("pe.A(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0) {
        this.field_d = this.field_e.field_a[0].next;
        this.field_a = 1;
        if (!param0) {
          return;
        }
        this.field_f = null;
    }

    public final boolean hasNext() {
        IntrusiveNode[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        int var2;
        var2 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (this.field_d != this.field_e.field_a[-1 + this.field_a]) {
          return true;
        }
        while (this.field_a < this.field_e.field_c) {
          fieldTemp$0 = this.field_e.field_a;
          fieldTemp$1 = this.field_a;
          this.field_a = this.field_a + 1;
          if (fieldTemp$0[fieldTemp$1].next != this.field_e.field_a[this.field_a - 1]) {
            this.field_d = this.field_e.field_a[this.field_a - 1].next;
            return true;
          }
          this.field_d = this.field_e.field_a[this.field_a - 1];
        }
        return false;
    }

    final static void decodeGameImagesAndFonts(ResourceArchive fontMetricsArchive, byte obfuscationGuard, ResourceArchive sharedSpriteArchive, ResourceArchive gameSpriteArchive) {
        int var4_int = 0;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        int var4_intLifetime1;
        int var4_intLifetime2;
        try {
          oo.field_ab = new vd[2];
          for (var4_int = 0; oo.field_ab.length > var4_int; var4_int++) {
            oo.field_ab[var4_int] = vd.b(gameSpriteArchive, "aceofskies", "background" + var4_int);
          }
          SteeringMode.field_d = new vd[8][];
          for (var4_intLifetime1 = 0; var4_intLifetime1 < 8; var4_intLifetime1++) {
            SteeringMode.field_d[var4_intLifetime1] = vd.a(gameSpriteArchive, "aceofskies", "plane" + var4_intLifetime1);
          }
          if (obfuscationGuard <= 22) {
            field_c = (String) null;
          }
          na.field_c = new vd[1];
          for (var4_intLifetime2 = 0; var4_intLifetime2 < 1; var4_intLifetime2++) {
            na.field_c[var4_intLifetime2] = vd.b(gameSpriteArchive, "aceofskies", "cloud" + var4_intLifetime2);
          }
          RendererManager.field_a = vd.b(gameSpriteArchive, "aceofskies", "bullet");
          tq.field_h = vd.a(gameSpriteArchive, "aceofskies", "smoke");
          ud.field_f = vd.a(gameSpriteArchive, "aceofskies", "explosion");
          gn.scorchSpriteData = vd.a(gameSpriteArchive, "aceofskies", "scorch");
          fs.field_e = vd.b(gameSpriteArchive, "", "titleimage");
          ArchiveIndex.field_f = new vd[3][];
          ArchiveIndex.field_f[0] = vd.a(gameSpriteArchive, "aceofskies", "oilgauge");
          ArchiveIndex.field_f[1] = vd.a(gameSpriteArchive, "aceofskies", "heatgauge");
          ArchiveIndex.field_f[2] = vd.a(gameSpriteArchive, "aceofskies", "supergauge");
          qq.field_e = vd.a(gameSpriteArchive, "aceofskies", "upgrades");
          FlightBody.field_a = vd.a(gameSpriteArchive, "aceofskies", "radar");
          eb.field_c = new vd[2];
          eb.field_c[0] = vd.b(gameSpriteArchive, "aceofskies", "scorecounter");
          eb.field_c[1] = vd.b(gameSpriteArchive, "aceofskies", "multiplier");
          kb.field_D = vd.a(gameSpriteArchive, "aceofskies", "scorenumbers");
          hq.field_a = vd.a(gameSpriteArchive, "aceofskies", "levelring");
          qa.field_a = vd.a(gameSpriteArchive, "", "keys");
          CipherPacketBuffer.field_m = vd.a(gameSpriteArchive, "", "fontalpha");
          hi.field_v = tg.a(fontMetricsArchive, 8191, "", "font");
          q.field_o = vd.a(gameSpriteArchive, "", "bigfontalpha");
          kn.field_b = tg.a(fontMetricsArchive, 8191, "", "bigfont");
          nc.field_a = vd.a(gameSpriteArchive, "", "titlefontalpha");
          dp.field_h = tg.a(fontMetricsArchive, 8191, "", "titlefont");
          lt.field_v = vd.b(gameSpriteArchive, "", "woodentile");
          gu.field_a = vd.a(gameSpriteArchive, "", "brassframe");
          vl.field_b = vd.a(gameSpriteArchive, "", "brassbutton");
          qk.field_a = vd.a(gameSpriteArchive, "", "brassslider");
          ol.field_e = vd.a(gameSpriteArchive, "aceofskies", "powerchutes");
          nu.field_b = vd.a(gameSpriteArchive, "aceofskies", "powericons");
          tt.field_c = new vd[2];
          tt.field_c[0] = vd.b(gameSpriteArchive, "aceofskies", "glassbulb");
          tt.field_c[1] = vd.b(gameSpriteArchive, "aceofskies", "bulblight");
          la.field_g = vd.a(gameSpriteArchive, "", "achievements");
          af.field_c = vd.a(gameSpriteArchive, "", "medals");
          vl.field_c = vd.b(sharedSpriteArchive, "basic", "orbcoin");
          es.field_i = vd.b(sharedSpriteArchive, "basic", "locked");
          HighscoreQuery.field_g = vd.b(sharedSpriteArchive, "basic", "unachieved");
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "pe.D(" + (fontMetricsArchive != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + (sharedSpriteArchive != null ? "{...}" : "null") + ',' + (gameSpriteArchive != null ? "{...}" : "null") + ')');
        }
    }

    public final void remove() {
        if (null == this.field_f) {
          throw new IllegalStateException();
        }
        this.field_f.unlink(-123);
        this.field_f = null;
    }

    public final Object next() {
        IntrusiveNode[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        IntrusiveNode var1;
        int var2;
        var2 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (this.field_d != this.field_e.field_a[-1 + this.field_a]) {
          var1 = this.field_d;
          this.field_f = var1;
          this.field_d = var1.next;
          return var1;
        }
        do {
          if (this.field_a >= this.field_e.field_c) {
            return null;
          }
          fieldTemp$0 = this.field_e.field_a;
          fieldTemp$1 = this.field_a;
          this.field_a = this.field_a + 1;
          var1 = fieldTemp$0[fieldTemp$1].next;
        } while (this.field_e.field_a[-1 + this.field_a] == var1);
        this.field_f = var1;
        this.field_d = var1.next;
        return var1;
    }

    pe(lc param0) {
        this.field_f = null;
        try {
          this.field_e = param0;
          this.a(true);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        highscoreNameEntries = null;
        if (param0 != 19592) {
          return;
        }
        field_c = null;
    }

    final static qm a(byte param0) {
        int var1 = 33 / ((14 - param0) / 58);
        if (ij.field_j == null) {
          ij.field_j = new qm(oi.field_c, 20, 0, 0, 0, 11579568, -1, 0, 0, oi.field_c.maxAscent, -1, 2147483647, true);
        }
        return ij.field_j;
    }

    static {
        int var0 = 0;
        highscoreNameEntries = new HighscoreNameEntry[255];
        for (var0 = 0; highscoreNameEntries.length > var0; var0++) {
          highscoreNameEntries[var0] = new HighscoreNameEntry();
        }
        field_c = "This is a hidden Achievement";
    }
}
