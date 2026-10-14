/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn {
    private int field_w;
    private int field_i;
    private rc field_e;
    private int field_t;
    private int field_j;
    private int field_d;
    private int field_g;
    private int field_v;
    static String field_k;
    private int field_c;
    static int field_f;
    private int field_x;
    static long field_n;
    static String[] packNames;
    private int field_q;
    private int field_m;
    private int field_s;
    private float field_r;
    private int field_h;
    private int field_l;
    private int field_a;
    static String field_o;
    static String messageText;
    private boolean field_b;

    final void c(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        if (null != ua.field_d) {
          return;
        }
        if (go.field_c > 0) {
          if (this.field_b) {
            fieldTemp$0 = this.field_w - 1;
            this.field_w = this.field_w - 1;
            if (fieldTemp$0 > 0) {
              return;
            }
            this.field_w = this.field_g;
            if (qh.field_a < this.field_c) {
              this.field_b = false;
            } else {
              if (param0 < 23) {
                this.field_l = -43;
              }
              this.d(0);
            }
            return;
          }
          if (this.field_m > to.field_b) {
            to.field_i = (-to.field_b + this.field_m) / 2;
          } else {
            if (this.field_m > 0) {
              to.field_i = 0;
            }
          }
          if (to.field_b == this.field_v &&
            be.field_g == this.field_t) {
            return;
          }
          this.field_e.a(this.field_v, this.field_t, -70);
          return;
        }
        this.field_b = false;
        if (!this.field_b) {
          if (this.field_m <= to.field_b) {
            if (this.field_m > 0) {
              to.field_i = 0;
            }
          } else {
            to.field_i = (-to.field_b + this.field_m) / 2;
          }
          if (to.field_b != this.field_v) {
            this.field_e.a(this.field_v, this.field_t, -70);
          } else {
            if (be.field_g != this.field_t) {
              this.field_e.a(this.field_v, this.field_t, -70);
            }
          }
          return;
        }
        fieldTemp$1 = this.field_w - 1;
        this.field_w = this.field_w - 1;
        if (fieldTemp$1 > 0) {
          return;
        }
        this.field_w = this.field_g;
        if (qh.field_a < this.field_c) {
          this.field_b = false;
        } else {
          if (param0 < 23) {
            this.field_l = -43;
          }
          this.d(0);
        }
        return;
    }

    final static void resendPendingRankingsRequests(byte obfuscationGuard, int opcode) {
        int var3 = 0;
        RankingsRequest var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard <= 118) {
            qn.a(17, -27, -12, -54, -92);
          }
          var4 = (RankingsRequest) (HuffmanCodec.pendingRankingsRequests.first(-99));
          while (var4 != null) {
            MultiplayerExitScreen.sendRankingsRequest(-21167, var4, opcode);
            var4 = (RankingsRequest) (HuffmanCodec.pendingRankingsRequests.next((byte) 116));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "qn.I(" + obfuscationGuard + ',' + opcode + ')');
        }
    }

    final void a(int param0) {
        this.field_e.a(this.field_l, this.field_d, -77);
        int var2 = 76 / ((param0 - 31) / 42);
    }

    final void a(int param0, int param1, int param2) {
        this.field_j = param2;
        this.field_m = param1;
        int var4 = 111 % ((param0 + 47) / 41);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        JungleBackground.field_r = new IsaacGenerator(new int[]{(int)MonotonicTime.nowMillis(false)});
        PauseMenuScreen.field_x = param1;
        if (param4 == -6532) {
          Mesh3D.field_k = param3;
          HotspotTextWidget.field_L = param2;
          wo.field_a = param0;
          FarmBackground.field_w = HotspotTextWidget.field_L - PauseMenuScreen.field_x;
          ag.field_E = -Mesh3D.field_k + wo.field_a;
          return;
        }
        qn.b(109);
        Mesh3D.field_k = param3;
        HotspotTextWidget.field_L = param2;
        wo.field_a = param0;
        FarmBackground.field_w = HotspotTextWidget.field_L - PauseMenuScreen.field_x;
        ag.field_E = -Mesh3D.field_k + wo.field_a;
    }

    final GameCanvas a(boolean param0) {
        this.field_d = be.field_g;
        this.field_l = to.field_b;
        this.field_e.a(this.field_q, this.field_s, -93);
        MusicCrossfadeStream.field_A = false;
        GameCanvas var2 = ff.a(0, 0, this.field_q, this.field_s, param0, lp.field_ub);
        if (var2 == null) {
          this.a(102);
        }
        return var2;
    }

    public static void b(int param0) {
        if (param0 == 0) {
          packNames = null;
          field_o = null;
          messageText = null;
          field_k = null;
          return;
        }
        qn.b(-47);
        packNames = null;
        field_o = null;
        messageText = null;
        field_k = null;
    }

    private qn() throws Throwable {
        throw new Error();
    }

    final boolean a(byte param0) {
        if (param0 != -32) {
          return true;
        }
        if (qh.field_a < this.field_c) {
          return false;
        }
        if (0 >= go.field_c) {
          return false;
        }
        return true;
    }

    private final void d(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = BrickABrac.field_J ? 1 : 0;
        var2 = this.field_m;
        var3 = this.field_j;
        if (!this.a((byte) -32)) {
          this.field_b = false;
          return;
        }
        if (var3 <= this.field_i) {
          if (var3 < this.field_h) {
            var3 = this.field_h;
          }
        } else {
          var3 = this.field_i;
        }
        if (this.field_x < var2) {
          var2 = this.field_x;
        } else {
          if (this.field_a <= var2) {
            if (!(0.0f < this.field_r)) {
              if (var2 != to.field_b) {
                this.field_e.a(var2, var3, -97);
              } else {
                if (var3 != be.field_g) {
                  this.field_e.a(var2, var3, -97);
                }
              }
              if (param0 < this.field_m) {
                to.field_i = (-to.field_b + this.field_m) / 2;
              }
              return;
            }
            var4 = (int)((float)var3 * this.field_r + 0.5f);
            if (var4 > var2) {
              var3 = (int)((float)var2 / this.field_r);
            } else {
              if (var2 > var4) {
                var2 = var4;
              }
            }
            if (var2 != to.field_b) {
              this.field_e.a(var2, var3, -97);
            } else {
              if (var3 != be.field_g) {
                this.field_e.a(var2, var3, -97);
              }
            }
            if (param0 < this.field_m) {
              to.field_i = (-to.field_b + this.field_m) / 2;
            }
            return;
          }
          var2 = this.field_a;
        }
        boolean decompiledFrameRemainder0 = true;
        if (0.0f < this.field_r) {
          var4Lifetime1 = (int)((float)var3 * this.field_r + 0.5f);
          if (var4Lifetime1 > var2) {
            var3 = (int)((float)var2 / this.field_r);
          } else {
            if (var2 > var4Lifetime1) {
              var2 = var4Lifetime1;
              if (var2 != to.field_b) {
                this.field_e.a(var2, var3, -97);
                if (param0 < this.field_m) {
                  to.field_i = (-to.field_b + this.field_m) / 2;
                }
                return;
              }
              if (var3 != be.field_g) {
                this.field_e.a(var2, var3, -97);
              }
              decompiledFrameRemainder0 = false;
            }
          }
        }
        if (decompiledFrameRemainder0) {
          if (var2 != to.field_b) {
            this.field_e.a(var2, var3, -97);
          } else {
            if (var3 != be.field_g) {
              this.field_e.a(var2, var3, -97);
            }
          }
        }
        if (param0 >= this.field_m) {
          return;
        }
        to.field_i = (-to.field_b + this.field_m) / 2;
    }

    static {
        field_k = "Please log in as a subscribing member to access this feature.";
        field_o = "Playing";
    }
}
