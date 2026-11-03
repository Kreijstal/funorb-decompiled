/*
 * Decompiled by CFR-JS 0.4.0.
 */
class MenuComponent extends IntrusiveNode {
    static IntrusiveDeque field_j;
    static String field_n;
    static String field_r;
    int field_t;
    boolean field_s;
    Object field_h;
    int field_k;
    int field_m;
    int field_i;
    String field_o;
    IntrusiveDeque field_l;
    boolean field_p;
    static AnimatedPanel field_q;

    final void translate(int param0, int param1, int param2) {
        MenuComponent var6 = null;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        MenuComponent var6Lifetime1;
        if (param1 != 0) {
          this.field_k = this.field_k + param1;
          this.field_t = this.field_t + param0;
          var6 = (MenuComponent) (this.field_l.startForward(param2));
          while (var6 != null) {
            var6.translate(param0, param1, 0);
            var6 = (MenuComponent) (this.field_l.nextForward((byte) -71));
          }
          return;
        }
        if (0 == param0) {
          return;
        }
        this.field_k = this.field_k + param1;
        this.field_t = this.field_t + param0;
        var6Lifetime1 = (MenuComponent) (this.field_l.startForward(param2));
        while (var6Lifetime1 != null) {
          var6Lifetime1.translate(param0, param1, 0);
          var6Lifetime1 = (MenuComponent) (this.field_l.nextForward((byte) -71));
        }
    }

    void unlinkChildren(int param0) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        MenuComponent var4 = (MenuComponent) (this.field_l.startForward(param0 ^ param0));
        while (var4 != null) {
          var4.unlink((byte) -69);
          var4 = (MenuComponent) (this.field_l.nextForward((byte) -71));
        }
    }

    final boolean isOrContains(byte param0, MenuComponent param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        MenuComponent var6 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this == param1) {
            return true;
          }
          var4 = -85 / ((-63 - param0) / 47);
          var6 = (MenuComponent) (this.field_l.startForward(0));
          while (var6 != null) {
            if (var6.isOrContains((byte) -125, param1)) {
              return true;
            }
            var6 = (MenuComponent) (this.field_l.nextForward((byte) -71));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("vd.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean containsPoint(int param0, int param1, int param2) {
        boolean stackIn_11_0 = false;
        boolean stackIn_18_0 = false;
        if (!this.field_p) {
          return false;
        }
        if (!this.field_s) {
          return false;
        }
        param0 = param0 - this.field_t;
        param1 = param1 - this.field_k;
        if (param2 == 0) {
          stackIn_11_0 = (0 <= param1) && (param0 >= 0) && (this.field_m > param1) && (param0 < this.field_i);
          return stackIn_11_0;
        }
        MenuComponent.d(-118);
        stackIn_18_0 = (0 <= param1) && (param0 >= 0) && (this.field_m > param1) && (param0 < this.field_i);
        return stackIn_18_0;
    }

    final static boolean a(int param0, Archive param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param1.getFile(param0, -1, param2);
          var4 = var5;
          if (var5 == null) {
            return false;
          }
          TurnEventLog.a(var5, (byte) 62);
          if (param3 == 2) {
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_11_0 = var4_ref;
          stackIn_11_1 = new StringBuilder().append("vd.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2) {
        if (null != QuickChatCategoryRegistry.field_d) {
          if (param1 <= QuickChatCategoryRegistry.field_d.length) {
            if (null == GameApplet.field_f ||
              !(param1 <= GameApplet.field_f.length)) {
              GameApplet.field_f = new int[param1 * 2];
            }
            if (null == fb.field_zb ||
              !(param1 <= fb.field_zb.length)) {
              fb.field_zb = new int[param1 * 2];
            }
            if (null == aj.field_d ||
              !(param1 <= aj.field_d.length)) {
              aj.field_d = new int[2 * param1];
            }
            if (WidgetContainer.field_y == null ||
              !(param1 <= WidgetContainer.field_y.length)) {
              WidgetContainer.field_y = new int[2 * param1];
            }
            if (null == GameState.field_c ||
              !(GameState.field_c.length >= param1)) {
              GameState.field_c = new int[param1 * 2];
            }
            if (lg.field_d == null ||
              !(param1 + param0 <= lg.field_d.length)) {
              lg.field_d = new int[2 * (param0 + param1)];
            }
            if (null == aq.field_p ||
              !(aq.field_p.length >= param1)) {
              aq.field_p = new boolean[2 * param1];
            }
          } else {
            QuickChatCategoryRegistry.field_d = new int[param1 * 2];
            if (null == GameApplet.field_f ||
              !(param1 <= GameApplet.field_f.length)) {
              GameApplet.field_f = new int[param1 * 2];
            }
            if (null == fb.field_zb ||
              !(param1 <= fb.field_zb.length)) {
              fb.field_zb = new int[param1 * 2];
            }
            if (null == aj.field_d ||
              !(param1 <= aj.field_d.length)) {
              aj.field_d = new int[2 * param1];
            }
            if (WidgetContainer.field_y == null ||
              !(param1 <= WidgetContainer.field_y.length)) {
              WidgetContainer.field_y = new int[2 * param1];
            }
            if (null == GameState.field_c ||
              !(GameState.field_c.length >= param1)) {
              GameState.field_c = new int[param1 * 2];
            }
            if (lg.field_d == null) {
              lg.field_d = new int[2 * (param0 + param1)];
              if (null == aq.field_p ||
                !(aq.field_p.length >= param1)) {
                aq.field_p = new boolean[2 * param1];
              }
            } else {
              if (param1 + param0 <= lg.field_d.length) {
                if (null == aq.field_p ||
                  !(aq.field_p.length >= param1)) {
                  aq.field_p = new boolean[2 * param1];
                }
              } else {
                lg.field_d = new int[2 * (param0 + param1)];
                if (null == aq.field_p ||
                  !(aq.field_p.length >= param1)) {
                  aq.field_p = new boolean[2 * param1];
                }
              }
            }
          }
        } else {
          QuickChatCategoryRegistry.field_d = new int[param1 * 2];
          if (null == GameApplet.field_f) {
            GameApplet.field_f = new int[param1 * 2];
            if (null == fb.field_zb ||
              !(param1 <= fb.field_zb.length)) {
              fb.field_zb = new int[param1 * 2];
            }
            if (null == aj.field_d ||
              !(param1 <= aj.field_d.length)) {
              aj.field_d = new int[2 * param1];
            }
            if (WidgetContainer.field_y == null ||
              !(param1 <= WidgetContainer.field_y.length)) {
              WidgetContainer.field_y = new int[2 * param1];
            }
            if (null == GameState.field_c ||
              !(GameState.field_c.length >= param1)) {
              GameState.field_c = new int[param1 * 2];
            }
            if (lg.field_d == null ||
              !(param1 + param0 <= lg.field_d.length)) {
              lg.field_d = new int[2 * (param0 + param1)];
            }
            if (null == aq.field_p ||
              !(aq.field_p.length >= param1)) {
              aq.field_p = new boolean[2 * param1];
            }
          } else {
            if (param1 > GameApplet.field_f.length) {
              GameApplet.field_f = new int[param1 * 2];
              if (null == fb.field_zb ||
                !(param1 <= fb.field_zb.length)) {
                fb.field_zb = new int[param1 * 2];
              }
              if (null == aj.field_d ||
                !(param1 <= aj.field_d.length)) {
                aj.field_d = new int[2 * param1];
              }
              if (WidgetContainer.field_y == null ||
                !(param1 <= WidgetContainer.field_y.length)) {
                WidgetContainer.field_y = new int[2 * param1];
              }
              if (null == GameState.field_c ||
                !(GameState.field_c.length >= param1)) {
                GameState.field_c = new int[param1 * 2];
              }
              if (lg.field_d == null ||
                !(param1 + param0 <= lg.field_d.length)) {
                lg.field_d = new int[2 * (param0 + param1)];
              }
              if (null == aq.field_p ||
                !(aq.field_p.length >= param1)) {
                aq.field_p = new boolean[2 * param1];
              }
            } else {
              if (null == fb.field_zb ||
                !(param1 <= fb.field_zb.length)) {
                fb.field_zb = new int[param1 * 2];
              }
              if (null == aj.field_d ||
                !(param1 <= aj.field_d.length)) {
                aj.field_d = new int[2 * param1];
              }
              if (WidgetContainer.field_y == null ||
                !(param1 <= WidgetContainer.field_y.length)) {
                WidgetContainer.field_y = new int[2 * param1];
              }
              if (null == GameState.field_c ||
                !(GameState.field_c.length >= param1)) {
                GameState.field_c = new int[param1 * 2];
              }
              if (lg.field_d == null) {
                lg.field_d = new int[2 * (param0 + param1)];
                if (null == aq.field_p ||
                  !(aq.field_p.length >= param1)) {
                  aq.field_p = new boolean[2 * param1];
                }
              } else {
                if (param1 + param0 <= lg.field_d.length) {
                  if (null == aq.field_p ||
                    !(aq.field_p.length >= param1)) {
                    aq.field_p = new boolean[2 * param1];
                  }
                } else {
                  lg.field_d = new int[2 * (param0 + param1)];
                  if (null == aq.field_p ||
                    !(aq.field_p.length >= param1)) {
                    aq.field_p = new boolean[2 * param1];
                  }
                }
              }
            }
          }
        }
        wm.field_c = 0;
        if (param2 != 18) {
          MenuComponent.a((byte) 6);
        }
        SpriteButton.field_u = 2147483647;
        GzipInflater.field_e = -2147483648;
        us.field_b = -2147483648;
        ef.field_a = 2147483647;
    }

    final void dispose(boolean param0) {
        MenuComponent var4 = null;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        MenuComponent var4Lifetime1;
        if (param0) {
          this.moveTo((byte) 48, 44, -59);
        } else {
          var4 = (MenuComponent) (this.field_l.startForward(0));
          while (var4 != null) {
            var4.dispose(false);
            var4 = (MenuComponent) (this.field_l.nextForward((byte) -71));
          }
          this.unlinkChildren(0);
          return;
        }
        var4Lifetime1 = (MenuComponent) (this.field_l.startForward(0));
        while (var4Lifetime1 != null) {
          var4Lifetime1.dispose(false);
          var4Lifetime1 = (MenuComponent) (this.field_l.nextForward((byte) -71));
        }
        this.unlinkChildren(0);
    }

    void addChild(MenuComponent param0, int param1) {
        try {
          this.field_l.addFirst(param0, param1 ^ param1);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "vd.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(int param0, int param1, int param2) {
        if (param1 != 0) {
          this.field_l = (IntrusiveDeque) null;
        }
    }

    public static void a(byte param0) {
        field_n = null;
        if (param0 <= -114) {
          field_q = null;
          field_j = null;
          field_r = null;
          return;
        }
        Archive var2 = (Archive) null;
        MenuComponent.a(40, (Archive) null, 88, 85);
        field_q = null;
        field_j = null;
        field_r = null;
    }

    void resize(boolean param0, int param1, int param2) {
        this.field_i = param1;
        if (param0) {
          this.field_m = param2;
          return;
        }
        this.b(55, 44, 18);
        this.field_m = param2;
    }

    final static void d(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        Archive var4 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1 = js.field_f;
          while (bk.a((byte) -50)) {
            var1.h(8, 255);
            fieldTemp$0 = var1.position + 1;
            var1.position = var1.position + 1;
            var2 = fieldTemp$0;
            StandardMapGenerator.a(var1, (byte) -128);
            js.field_f.patchLengthByte(-var2 + var1.position, (byte) 118);
          }
          if (param0 != 2147483647) {
            var4 = (Archive) null;
            MenuComponent.a(0, (Archive) null, -70, 78);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var1_ref), "vd.HA(" + param0 + ')');
        }
    }

    MenuComponent findComponentAt(byte param0, int param1, int param2) {
        if (this.containsPoint(param1, param2, 0)) {
          return this;
        }
        if (param0 > 51) {
          return null;
        }
        this.field_k = -116;
        return null;
    }

    final void moveTo(byte param0, int param1, int param2) {
        if (param1 != this.field_k) {
          this.translate(param2 - this.field_t, -this.field_k + param1, 0);
          if (param0 < 37) {
            this.findComponentAt((byte) -125, 17, -8);
          }
          return;
        }
        if (param2 == this.field_t) {
          return;
        }
        this.translate(param2 - this.field_t, -this.field_k + param1, 0);
        if (param0 < 37) {
          this.findComponentAt((byte) -125, 17, -8);
        }
    }

    void a(int param0) {
        int var2 = 27 / ((param0 - 67) / 47);
    }

    MenuComponent(int param0, int param1, int param2, int param3) {
        rs.field_Cb.stringWidth("200");
        this.field_k = param0;
        this.field_h = null;
        this.field_i = param3;
        this.field_t = param1;
        this.field_p = true;
        this.field_s = true;
        this.field_m = param2;
        this.field_l = new IntrusiveDeque();
    }

    void b(int param0, int param1, int param2) {
        if (param2 != -498) {
          this.field_p = true;
        }
    }

    static {
        field_r = "This game option is only available to members.";
        field_n = "Colony homeworld";
    }
}
