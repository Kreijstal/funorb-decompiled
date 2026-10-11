/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tl implements Iterator {
    private IntrusiveNode field_d;
    static RgbSprite field_e;
    private int field_b;
    private IntrusiveNode field_c;
    static String field_a;
    static String field_f;
    static me field_i;
    private m field_g;
    static String field_h;

    public final void remove() {
        if (this.field_c == null) {
          throw new IllegalStateException();
        }
        this.field_c.unlink(42);
        this.field_c = null;
    }

    final static void a(int param0, java.awt.Color param1, String param2, boolean param3, int param4) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          try {
            var9 = si.field_b.getGraphics();
            if (null == BattleCharacter.field_g) {
              BattleCharacter.field_g = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param3) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, bn.field_b, dt.field_a);
            }
            if (param1 == null) {
              param1 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (gp.field_e == null) {
                gp.field_e = si.field_b.createImage(304, 34);
              }
              var10 = gp.field_e.getGraphics();
              var10.setColor(param1);
              if (param0 != -5790) {
                return;
              }
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, 3 * param4, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(param4 * 3 + 2, 2, 300 - param4 * 3, 30);
              var10.setFont(BattleCharacter.field_g);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param2, (304 - 6 * param2.length()) / 2, 22);
              var9.drawImage(gp.field_e, -152 + bn.field_b / 2, dt.field_a / 2 - 18, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = bn.field_b / 2 - 152;
              var8 = -18 + dt.field_a / 2;
              var9.setColor(param1);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(2 + var7, var8 + 2, param4 * 3, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(var7 + 1, 1 + var8, 301, 31);
              var9.fillRect(param4 * 3 + 2 + var7, var8 + 2, -(param4 * 3) + 300, 30);
              var9.setFont(BattleCharacter.field_g);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param2, var7 + (304 - param2.length() * 6) / 2, 22 + var8);
            }
            if (an.field_G == null) {
              return;
            }
            var9.setFont(BattleCharacter.field_g);
            var9.setColor(java.awt.Color.white);
            var9.drawString(an.field_G, bn.field_b / 2 - an.field_G.length() * 6 / 2, dt.field_a / 2 - 26);
            return;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            si.field_b.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var5_ref;
          stackIn_21_1 = new StringBuilder().append("tl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void b(byte param0) {
        SoftwareRaster.b();
        if (param0 != -90) {
          field_i = (me) null;
          ll.field_Rb.c(2);
          return;
        }
        ll.field_Rb.c(2);
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        int var2;
        IntrusiveNode var3;
        IntrusiveNode var4;
        var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_g.field_c[this.field_b - 1] != this.field_d) {
          var4 = this.field_d;
          this.field_d = var4.next;
          this.field_c = var4;
          return var4;
        }
        do {
          if (this.field_g.field_d <= this.field_b) {
            return null;
          }
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          var3 = this.field_g.field_c[fieldTemp$0].next;
        } while (var3 == this.field_g.field_c[-1 + this.field_b]);
        this.field_c = var3;
        this.field_d = var3.next;
        return var3;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_g.field_c[-1 + this.field_b] != this.field_d) {
          return true;
        }
        while (this.field_b < this.field_g.field_d) {
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          if (this.field_g.field_c[fieldTemp$0].next != this.field_g.field_c[this.field_b - 1]) {
            this.field_d = this.field_g.field_c[this.field_b - 1].next;
            return true;
          }
          this.field_d = this.field_g.field_c[this.field_b - 1];
        }
        return false;
    }

    final static void a(byte param0, kl param1, kl param2) {
        try {
          jj.field_c = param2;
          up.field_e = param1;
          if (param0 > -117) {
            field_a = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "tl.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_i = null;
        int var1 = -28 % ((param0 + 69) / 51);
        field_f = null;
        field_e = null;
        field_h = null;
    }

    private final void c(byte param0) {
        this.field_c = null;
        this.field_d = this.field_g.field_c[0].next;
        if (param0 < -85) {
          this.field_b = 1;
          return;
        }
        this.field_c = (IntrusiveNode) null;
        this.field_b = 1;
    }

    tl(m param0) {
        this.field_c = null;
        try {
          this.field_g = param0;
          this.c((byte) -101);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "tl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_f = "Rune";
        field_i = new me(6, 0, 4, 2);
        field_h = "Log in / Create account";
    }
}
