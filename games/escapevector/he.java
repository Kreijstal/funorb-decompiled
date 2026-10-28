/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class he extends TextWidgetPainter {
    static String field_q;
    static Calendar field_s;
    static String field_v;
    private ef[] field_w;
    static GameAppletShell field_r;
    static int field_y;
    private ef field_t;
    static ResourceArchive field_u;
    static int field_x;

    final ef a(int param0, byte param1) {
        if (param1 == -53) {
          ef dupTemp$0 = new ef();
          this.field_w[param0] = dupTemp$0;
          return dupTemp$0;
        }
        this.field_t = (ef) null;
        ef dupTemp$1 = new ef();
        this.field_w[param0] = dupTemp$1;
        return dupTemp$1;
    }

    final static IndexedSprite a(ResourceArchive param0, int param1, int param2, int param3) {
        String stackIn_10_2 = null;
        try {
          if (param1 != -18109) {
            field_v = (String) null;
          }
          if (uc.a(param0, 96, param3, param2)) {
            IndexedSprite stackIn_6_0 = da.b((byte) 8);
            return stackIn_6_0;
          }
          Object stackIn_4_0 = null;
          return (IndexedSprite) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var4;
          StringBuilder stackIn_9_1 = new StringBuilder().append("he.Q(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(Sprite[] param0, int param1) {
        String stackIn_14_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          ef[] var7 = this.field_w;
          ef[] var3 = var7;
          for (int var4 = 0; var7.length > var4; var4++) {
            ef var5 = var7[var4];
            if (var5 != null) {
              var5.field_i = param0;
            }
          }
          if (param1 == 6) {
            return;
          }
          field_v = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3_ref;
          StringBuilder stackIn_13_1 = new StringBuilder().append("he.O(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void drawWidget(int originX, int originY, int guard, UiComponent component, boolean enabled) {
        UiComponent stackIn_3_0 = null;
        String stackIn_34_2 = null;
        try {
          if (!(component instanceof TextButton)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (UiComponent) (component);
          }
          TextButton var10 = (TextButton) (stackIn_3_0);
          rd.a(component.width + component.x + originX, originX + component.x, component.y + (originY + component.height), 19807, originY + component.y);
          if (var10 != null) {
            enabled = enabled & var10.enabled;
          }
          ef var7 = this.field_w[0];
          this.field_t.a(true);
          var7.a(originX, this.field_t, component, originY, 63, this);
          if (var10 != null) {
            if (var10.field_z) {
              ef var11 = this.field_w[1];
              if (var11 != null) {
                var11.a(originX, this.field_t, component, originY, -106, this);
              }
            }
            if (var10.hovered) {
              ef var12 = this.field_w[3];
              if (0 != var10.field_t &&
                var12 != null) {
                var12.a(originX, this.field_t, component, originY, -124, this);
              } else {
                ef var9 = this.field_w[2];
                if (var9 != null) {
                  var9.a(originX, this.field_t, component, originY, -101, this);
                }
              }
            }
          }
          if (component.isFocused(0)) {
            ef var13 = this.field_w[5];
            if (var13 != null) {
              var13.a(originX, this.field_t, component, originY, 51, this);
            }
          }
          if (!enabled) {
            ef var14 = this.field_w[4];
            if (var14 != null) {
              var14.a(originX, this.field_t, component, originY, -94, this);
            }
          }
          if (guard >= -14) {
            he.a(true);
          }
          this.field_t.a(this, component, originX, originY, (byte) 21);
          dl.a((byte) -8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_33_0 = var6;
          StringBuilder stackIn_33_1 = new StringBuilder().append("he.M(").append(originX).append(',').append(originY).append(',').append(guard).append(',');
          if (component == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(enabled).append(')').toString());
        }
    }

    final void a(Sprite param0, byte param1) {
        String stackIn_14_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          ef[] var7 = this.field_w;
          ef[] var3 = var7;
          for (int var4 = 0; var7.length > var4; var4++) {
            ef var5 = var7[var4];
            if (var5 != null) {
              var5.field_g = param0;
            }
          }
          if (param1 > 65) {
            return;
          }
          he.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3_ref;
          StringBuilder stackIn_13_1 = new StringBuilder().append("he.R(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    he(he param0, boolean param1) {
        this();
        try {
          param0.a(param1, 123, this);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "he.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static kb a(String param0, int param1, byte param2) {
        String stackIn_5_2 = null;
        try {
          jb var3 = new jb();
          int var4 = -90 / ((param2 + 5) / 40);
          ((kb) ((Object) var3)).field_b = param1;
          ((kb) ((Object) var3)).field_a = param0;
          jb stackIn_1_0 = var3;
          return (kb) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var3_ref;
          StringBuilder stackIn_4_1 = new StringBuilder().append("he.S(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_v = null;
        field_u = null;
        field_q = null;
        if (!param0) {
          return;
        }
        field_s = null;
    }

    public he() {
        this.field_w = new ef[6];
        this.field_t = new ef();
        ef dupTemp$0 = new ef();
        this.field_w[0] = dupTemp$0;
        ef var1 = dupTemp$0;
        var1.a(true);
    }

    private final void a(boolean param0, int param1, he param2) {
        ef stackIn_9_2 = null;
        String stackIn_19_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          super.a(param2, 127);
          if (param0) {
            for (int var4_int = 0; var4_int < 6; var4_int++) {
              ef var5 = this.field_w[var4_int];
              if (var5 != null) {
                ef var6 = param2.field_w[var4_int];
                ef stackIn_8_0 = var5;
                int stackIn_8_1 = -2;
                if (var6 == null) {
                  ef dupTemp$0 = new ef();
                  param2.field_w[var4_int] = dupTemp$0;
                  stackIn_9_2 = dupTemp$0;
                } else {
                  stackIn_9_2 = var6;
                }
                ((ef) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_9_2);
              } else {
                param2.field_w[var4_int] = null;
              }
            }
          } else {
            qg.a(this.field_w, 0, param2.field_w, 0, 6);
          }
          if (param1 > 120) {
            return;
          }
          field_r = (GameAppletShell) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var4;
          StringBuilder stackIn_18_1 = new StringBuilder().append("he.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void a(Sprite[] param0, int param1, byte param2) {
        try {
          int var4_int = param1;
          if (param2 != -117) {
            he var5 = (he) null;
            this.a(false, -105, (he) null);
          }
          if (this.field_w[var4_int] == null) {
            this.field_w[var4_int] = new ef();
          }
          this.field_w[param1].field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "he.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_v = "Tutorial";
        field_r = null;
        field_q = "Not yet achieved";
        field_s = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
