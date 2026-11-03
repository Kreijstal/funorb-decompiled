/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollPane extends UiLayoutNode {
    static int field_Bb;
    VerticalScrollbar field_Fb;
    static IntrusiveDeque field_Jb;
    static String field_Eb;
    UiLayoutNode field_Ab;
    static String field_yb;
    static UiLayoutNode field_Cb;
    UiLayoutNode field_zb;
    static String field_Db;
    static UiLayoutNode field_Hb;
    static String field_Ib;
    static String field_Gb;

    private final void advanceScroll(boolean param0, int param1, int param2, int param3, boolean param4) {
        if (this.field_Fb.pollScrollUp(-819561055)) {
          this.field_Ab.field_v = this.field_Ab.field_v + param2;
        }
        if (this.field_Fb.pollScrollDown((byte) -40)) {
          this.field_Ab.field_v = this.field_Ab.field_v - param2;
        }
        if (this.field_Fb.pollPageUp(23028)) {
          this.field_Ab.field_v = this.field_Ab.field_v + param3;
        }
        if (this.field_Fb.pollPageDown(-1)) {
          this.field_Ab.field_v = this.field_Ab.field_v - param3;
          if (this.field_gb) {
            this.field_Ab.field_v = this.field_Ab.field_v - param1;
          }
          if (!param4) {
            if (-this.field_zb.field_mb + (this.field_Ab.field_mb + this.field_Ab.field_L) < -(this.field_Ab.field_v + this.field_Ab.field_J)) {
              this.field_Ab.field_v = -this.field_Ab.field_J - (-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L);
            }
            if (-(this.field_Ab.field_v + this.field_Ab.field_J) < 0) {
              this.field_Ab.field_v = -this.field_Ab.field_J;
            }
          } else {
            if (-(this.field_Ab.field_J + this.field_Ab.field_v) < 0) {
              this.field_Ab.field_v = -this.field_Ab.field_J;
            }
            if (-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L < -(this.field_Ab.field_v + this.field_Ab.field_J)) {
              this.field_Ab.field_v = -(-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L) - this.field_Ab.field_J;
            }
          }
        } else {
          if (this.field_gb) {
            this.field_Ab.field_v = this.field_Ab.field_v - param1;
            if (!param4) {
              if (-this.field_zb.field_mb + (this.field_Ab.field_mb + this.field_Ab.field_L) < -(this.field_Ab.field_v + this.field_Ab.field_J)) {
                this.field_Ab.field_v = -this.field_Ab.field_J - (-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L);
              }
              if (-(this.field_Ab.field_v + this.field_Ab.field_J) >= 0) {
                if (this.field_Fb.isThumbHeld(-103)) {
                  this.field_Ab.field_J = -this.field_Fb.getDraggedScrollOffset(124, param4, this.field_Ab.field_mb, this.field_zb.field_mb);
                  this.field_Ab.field_v = 0;
                }
                this.field_Fb.layoutThumb(this.field_Ab.field_mb, this.field_zb.field_mb, (byte) 83, -this.field_Ab.field_J);
                if (param0) {
                  ScrollPane.a(-14);
                }
                return;
              }
              this.field_Ab.field_v = -this.field_Ab.field_J;
            } else {
              if (-(this.field_Ab.field_J + this.field_Ab.field_v) < 0) {
                this.field_Ab.field_v = -this.field_Ab.field_J;
              }
              if (-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L >= -(this.field_Ab.field_v + this.field_Ab.field_J)) {
                if (this.field_Fb.isThumbHeld(-103)) {
                  this.field_Ab.field_J = -this.field_Fb.getDraggedScrollOffset(124, param4, this.field_Ab.field_mb, this.field_zb.field_mb);
                  this.field_Ab.field_v = 0;
                }
                this.field_Fb.layoutThumb(this.field_Ab.field_mb, this.field_zb.field_mb, (byte) 83, -this.field_Ab.field_J);
                if (param0) {
                  ScrollPane.a(-14);
                }
                return;
              }
              this.field_Ab.field_v = -(-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L) - this.field_Ab.field_J;
            }
            if (this.field_Fb.isThumbHeld(-103)) {
              this.field_Ab.field_J = -this.field_Fb.getDraggedScrollOffset(124, param4, this.field_Ab.field_mb, this.field_zb.field_mb);
              this.field_Ab.field_v = 0;
            }
            this.field_Fb.layoutThumb(this.field_Ab.field_mb, this.field_zb.field_mb, (byte) 83, -this.field_Ab.field_J);
            if (!param0) {
              return;
            }
            ScrollPane.a(-14);
            return;
          }
          if (!param4) {
            if (-this.field_zb.field_mb + (this.field_Ab.field_mb + this.field_Ab.field_L) < -(this.field_Ab.field_v + this.field_Ab.field_J)) {
              this.field_Ab.field_v = -this.field_Ab.field_J - (-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L);
            }
            if (-(this.field_Ab.field_v + this.field_Ab.field_J) < 0) {
              this.field_Ab.field_v = -this.field_Ab.field_J;
            }
            if (this.field_Fb.isThumbHeld(-103)) {
              this.field_Ab.field_J = -this.field_Fb.getDraggedScrollOffset(124, param4, this.field_Ab.field_mb, this.field_zb.field_mb);
              this.field_Ab.field_v = 0;
            }
            this.field_Fb.layoutThumb(this.field_Ab.field_mb, this.field_zb.field_mb, (byte) 83, -this.field_Ab.field_J);
            if (!param0) {
              return;
            }
            ScrollPane.a(-14);
            return;
          }
          if (-(this.field_Ab.field_J + this.field_Ab.field_v) >= 0) {
            if (-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L < -(this.field_Ab.field_v + this.field_Ab.field_J)) {
              this.field_Ab.field_v = -(-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L) - this.field_Ab.field_J;
            }
            if (this.field_Fb.isThumbHeld(-103)) {
              this.field_Ab.field_J = -this.field_Fb.getDraggedScrollOffset(124, param4, this.field_Ab.field_mb, this.field_zb.field_mb);
              this.field_Ab.field_v = 0;
            }
            this.field_Fb.layoutThumb(this.field_Ab.field_mb, this.field_zb.field_mb, (byte) 83, -this.field_Ab.field_J);
            if (!param0) {
              return;
            }
            ScrollPane.a(-14);
            return;
          }
          this.field_Ab.field_v = -this.field_Ab.field_J;
          if (-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L >= -(this.field_Ab.field_v + this.field_Ab.field_J)) {
            if (this.field_Fb.isThumbHeld(-103)) {
              this.field_Ab.field_J = -this.field_Fb.getDraggedScrollOffset(124, param4, this.field_Ab.field_mb, this.field_zb.field_mb);
              this.field_Ab.field_v = 0;
            }
            this.field_Fb.layoutThumb(this.field_Ab.field_mb, this.field_zb.field_mb, (byte) 83, -this.field_Ab.field_J);
            if (!param0) {
              return;
            }
            ScrollPane.a(-14);
            return;
          }
          this.field_Ab.field_v = -(-this.field_zb.field_mb + this.field_Ab.field_mb + this.field_Ab.field_L) - this.field_Ab.field_J;
        }
        if (this.field_Fb.isThumbHeld(-103)) {
          this.field_Ab.field_J = -this.field_Fb.getDraggedScrollOffset(124, param4, this.field_Ab.field_mb, this.field_zb.field_mb);
          this.field_Ab.field_v = 0;
        }
        this.field_Fb.layoutThumb(this.field_Ab.field_mb, this.field_zb.field_mb, (byte) 83, -this.field_Ab.field_J);
        if (param0) {
          ScrollPane.a(-14);
        }
    }

    final static boolean h(byte param0) {
        int var1 = -35 % ((-48 - param0) / 50);
        return TickClock.a(wq.field_d, true);
    }

    private final void layoutViewport(int param0, byte param1, int param2) {
        int var4 = 20 % ((78 - param1) / 45);
        this.field_zb.field_q = -param2 - param0 + this.field_q;
        this.field_Ab.field_s = 0;
        this.field_zb.field_mb = this.field_mb;
        this.field_Ab.field_q = -param2 - param0 + this.field_q;
        this.field_Fb.setLayout(-param0 + this.field_q, true, this.field_mb, param0, this.field_Ab.field_mb, this.field_zb.field_mb, 0, -this.field_Ab.field_J);
    }

    final void updateScroll(int param0, int param1, boolean param2, int param3) {
        this.advanceScroll(false, param1, param0, this.field_zb.field_mb, param2);
        if (param3 != 0) {
          field_Cb = (UiLayoutNode) null;
        }
    }

    final static boolean a(int param0) {
        if (param0 < 11) {
          return true;
        }
        return AnimationPlayer.field_c == PlayerContextMenu.field_i.field_Nb ? true : false;
    }

    final static void b(int param0) {
        ParticipantStatus.field_t.field_o = 0;
        if (param0 != 23877) {
          ScrollPane.a(85, 43, -33);
          ParticipantStatus.field_t.field_l = 0;
          return;
        }
        ParticipantStatus.field_t.field_l = 0;
    }

    public static void releaseStatics(byte param0) {
        if (param0 <= -19) {
          field_Eb = null;
          field_Hb = null;
          field_Jb = null;
          field_Db = null;
          field_yb = null;
          field_Gb = null;
          field_Cb = null;
          field_Ib = null;
          return;
        }
        field_yb = (String) null;
        field_Eb = null;
        field_Hb = null;
        field_Jb = null;
        field_Db = null;
        field_yb = null;
        field_Gb = null;
        field_Cb = null;
        field_Ib = null;
    }

    ScrollPane(long param0, UiLayoutNode param1, UiLayoutNode param2, VerticalScrollbar param3) {
        super(param0, (UiLayoutNode) null);
        try {
          this.field_zb = new UiLayoutNode(0L, param2);
          this.field_Fb = new VerticalScrollbar(0L, param3);
          this.addChild((byte) -109, this.field_zb);
          this.addChild((byte) -113, (UiLayoutNode) (this.field_Fb));
          this.field_Ab = param1;
          this.field_zb.addChild((byte) -125, param1);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "np.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, boolean param1, boolean param2, int param3, boolean param4, int param5) {
        if (param4) {
          return false;
        }
        return this.a(param2, (byte) 38, param3, param5, this.field_zb.field_mb, param0, param1);
    }

    private final boolean a(boolean param0, byte param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        if (param1 != 38) {
          ScrollPane.b(-63);
        }
        if (param6) {
          var8 = 1;
          this.field_Ab.layoutVerticalContent(19, param2, this.field_zb.field_mb, var8 != 0);
          this.advanceScroll(false, param5, param3, param4, false);
          return var8 != 0;
        }
        if (!this.field_gb) {
          var8Lifetime1 = 0;
          this.field_Ab.layoutVerticalContent(19, param2, this.field_zb.field_mb, var8Lifetime1 != 0);
          this.advanceScroll(false, param5, param3, param4, false);
          return var8Lifetime1 != 0;
        }
        if (!param0) {
          var8Lifetime2 = 1;
          this.field_Ab.layoutVerticalContent(19, param2, this.field_zb.field_mb, var8Lifetime2 != 0);
          this.advanceScroll(false, param5, param3, param4, false);
          return var8Lifetime2 != 0;
        }
        var8Lifetime3 = 0;
        this.field_Ab.layoutVerticalContent(19, param2, this.field_zb.field_mb, var8Lifetime3 != 0);
        this.advanceScroll(false, param5, param3, param4, false);
        return var8Lifetime3 != 0;
    }

    final static void h(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var2;
        var2 = Kickabout.field_G;
        if (param0 != -1) {
          return;
        }
        if (we.field_c == WeightedLruCache.field_a) {
          fieldTemp$1 = LoginDialog.field_bb;
          LoginDialog.field_bb = LoginDialog.field_bb + 1;
          if (fieldTemp$1 < 16) {
            return;
          }
          if (!SaveChangesDialog.field_G) {
            SquadPickerDialog.g((byte) 66);
          } else {
            kw.b(0);
          }
          WeightedLruCache.field_a = ContextMenuItem.field_Hb;
          return;
        }
        if (WeightedLruCache.field_a != ContextMenuItem.field_Hb) {
          if (LeaguesScreen.field_A != WeightedLruCache.field_a) {
            return;
          }
          fieldTemp$2 = LoginDialog.field_bb;
          LoginDialog.field_bb = LoginDialog.field_bb - 1;
          if (fieldTemp$2 > 0) {
            return;
          }
          WeightedLruCache.field_a = WeightedLruCache.field_j;
          return;
        }
        if (!PlayArea.a(100)) {
          if (vs.field_g != null) {
            LoginForm.a((byte) 70, 3, vs.field_g);
          }
          ImageProducerRasterBuffer.c((byte) -77);
          if (ProxySocketConnector.field_e) {
            ProxySocketConnector.field_e = false;
            ConsoleEvaluationException.a(false, 0);
          }
        }
        WeightedLruCache.field_a = LeaguesScreen.field_A;
    }

    final void setLayout(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_q = param5;
        this.field_J = param3;
        this.field_mb = param2;
        this.field_s = param4;
        this.layoutViewport(param6, (byte) 124, param0);
        if (param1 < 36) {
          ScrollPane.h((byte) 12);
        }
    }

    final static void a(int param0, int param1, int param2) {
        PasswordValidator.a(0, param2, param0, true, (byte) -55);
        int var3 = -114 / ((param1 - 16) / 57);
    }

    static {
        field_Bb = 360;
        field_yb = "<%0> wins the tournament for making more passes than <%1>";
        field_Db = "No";
        field_Eb = "Players: ";
        field_Ib = "decrease starting price by <%0>";
        field_Jb = new IntrusiveDeque();
        field_Gb = "gamemodes";
    }
}
