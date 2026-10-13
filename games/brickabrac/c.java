/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static int field_g;
    static String field_c;
    private boolean field_f;
    static IndexedSprite[] field_i;
    static ta field_l;
    private int field_h;
    private int[] field_k;
    static vm field_j;
    static th field_m;
    private int field_b;
    static int cyclesDue;
    static String field_d;
    static RgbSprite field_e;
    static String field_n;

    public static void a(boolean param0) {
        field_j = null;
        field_d = null;
        field_m = null;
        field_n = null;
        field_i = null;
        field_l = null;
        field_e = null;
        field_c = null;
        if (!param0) {
          PacketBuffer var2 = (PacketBuffer) null;
          c.a(6, -63, 125, -38, (PacketBuffer) null);
          return;
        }
    }

    final static void a(int param0, String param1, byte param2, int param3, int param4, String param5) {
        BitPacketBuffer var9 = null;
        int var8 = 0;
        try {
          var9 = k.outgoingPackets;
          BitPacketBuffer var6 = var9;
          int var7 = -44 / ((-59 - param2) / 38);
          var9.writeCipheredOpcode(-13413, param4);
          var9.position = var9.position + 1;
          var8 = var9.position;
          var9.writeByte(86, param3);
          if (param3 == 2) {
            var9.writeCp1252String(param1, -1);
          }
          if (param5 != null) {
            InstructionsScreen.writeCompressedString(26152, param5, var9);
          } else {
            var9.writeShort((byte) 123, param0);
          }
          var9.backfillByteLength((byte) 116, var9.position - var8);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "c.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1) {
        if (param1 < 0) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (this.field_h < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param1 != this.field_h) {
          pm.a(this.field_k, 1 + param1, this.field_k, param1, -param1 + this.field_h);
          this.field_h = this.field_h - 1;
          if (param0 != 46) {
            field_c = (String) null;
            return;
          }
          return;
        }
        this.field_h = this.field_h - 1;
        if (param0 != 46) {
          field_c = (String) null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, boolean param4, byte param5, boolean param6, boolean param7, boolean param8, int param9) {
        int var11;
        var11 = BrickABrac.field_J ? 1 : 0;
        if (param3) {
          if (param3) {
            qh.field_f = id.field_Pb;
            pq.a(-128, param3);
            if (ml.field_b > 0) {
              na.a(param8, param3, -94, param2);
            }
            AppletGameShell.field_e.field_S = 1;
            AppletGameShell.field_e.field_V = Paddle.field_C.field_V;
            if (0 < IntArrayRequest.field_j) {
              n.a(param2, param8, param3, (byte) -76);
            }
            if (TableDataRequest.field_m > 0) {
              nh.a(true, param3, param8, param2, param7);
            }
            if (hc.field_c &&
              o.field_e.field_jc <= o.field_e.field_cc) {
              IsaacGenerator.field_b.field_Qb.field_Mb = GameCanvas.field_d;
              Ball.field_A.field_eb = false;
              jh.a(true, IsaacGenerator.field_b.field_Rb);
            } else {
              IsaacGenerator.field_b.field_Qb.field_Mb = null;
              Ball.field_A.field_eb = true;
              ka.a(param4, IsaacGenerator.field_b, param2, param0, -108);
            }
          } else {
            qh.field_f = (kp.field_a - 640) / 2;
            pq.a(-128, param3);
            if (ml.field_b > 0) {
              na.a(param8, param3, -94, param2);
              AppletGameShell.field_e.field_S = 1;
              AppletGameShell.field_e.field_V = Paddle.field_C.field_V;
              if (0 < IntArrayRequest.field_j) {
                n.a(param2, param8, param3, (byte) -76);
              }
              if (TableDataRequest.field_m > 0) {
                nh.a(true, param3, param8, param2, param7);
              }
              if (hc.field_c &&
                o.field_e.field_jc <= o.field_e.field_cc) {
                IsaacGenerator.field_b.field_Qb.field_Mb = GameCanvas.field_d;
                Ball.field_A.field_eb = false;
                jh.a(true, IsaacGenerator.field_b.field_Rb);
              } else {
                IsaacGenerator.field_b.field_Qb.field_Mb = null;
                Ball.field_A.field_eb = true;
                ka.a(param4, IsaacGenerator.field_b, param2, param0, -108);
              }
            } else {
              AppletGameShell.field_e.field_S = 1;
              AppletGameShell.field_e.field_V = Paddle.field_C.field_V;
              if (0 < IntArrayRequest.field_j) {
                n.a(param2, param8, param3, (byte) -76);
              }
              if (TableDataRequest.field_m > 0) {
                nh.a(true, param3, param8, param2, param7);
              }
              if (!hc.field_c) {
                IsaacGenerator.field_b.field_Qb.field_Mb = null;
                Ball.field_A.field_eb = true;
                ka.a(param4, IsaacGenerator.field_b, param2, param0, -108);
              } else {
                if (o.field_e.field_jc > o.field_e.field_cc) {
                  IsaacGenerator.field_b.field_Qb.field_Mb = null;
                  Ball.field_A.field_eb = true;
                  ka.a(param4, IsaacGenerator.field_b, param2, param0, -108);
                } else {
                  IsaacGenerator.field_b.field_Qb.field_Mb = GameCanvas.field_d;
                  Ball.field_A.field_eb = false;
                  jh.a(true, IsaacGenerator.field_b.field_Rb);
                }
              }
            }
          }
        } else {
          if (Rasterizer2D.width == kp.field_a) {
            if (Rasterizer2D.height != IsaacGenerator.field_i &&
              Rasterizer2D.height == BallPulseEffect.framebuffer.height &&
              Rasterizer2D.width == BallPulseEffect.framebuffer.width) {
              if (o.field_e != null) {
                CacheIoRequest.a(true, false);
              } else {
                if (null != nl.field_f) {
                  CacheIoRequest.a(true, true);
                } else {
                  NanoGameClock.b(31);
                }
              }
            }
            if (param3) {
              qh.field_f = id.field_Pb;
              pq.a(-128, param3);
              if (ml.field_b > 0) {
                na.a(param8, param3, -94, param2);
              }
              AppletGameShell.field_e.field_S = 1;
              AppletGameShell.field_e.field_V = Paddle.field_C.field_V;
              if (0 < IntArrayRequest.field_j) {
                n.a(param2, param8, param3, (byte) -76);
              }
              if (TableDataRequest.field_m > 0) {
                nh.a(true, param3, param8, param2, param7);
              }
              if (hc.field_c &&
                o.field_e.field_jc <= o.field_e.field_cc) {
                IsaacGenerator.field_b.field_Qb.field_Mb = GameCanvas.field_d;
                Ball.field_A.field_eb = false;
                jh.a(true, IsaacGenerator.field_b.field_Rb);
              } else {
                IsaacGenerator.field_b.field_Qb.field_Mb = null;
                Ball.field_A.field_eb = true;
                ka.a(param4, IsaacGenerator.field_b, param2, param0, -108);
              }
            } else {
              qh.field_f = (kp.field_a - 640) / 2;
              pq.a(-128, param3);
              if (ml.field_b > 0) {
                na.a(param8, param3, -94, param2);
              }
              AppletGameShell.field_e.field_S = 1;
              AppletGameShell.field_e.field_V = Paddle.field_C.field_V;
              if (0 < IntArrayRequest.field_j) {
                n.a(param2, param8, param3, (byte) -76);
              }
              if (TableDataRequest.field_m > 0) {
                nh.a(true, param3, param8, param2, param7);
              }
              if (!hc.field_c) {
                IsaacGenerator.field_b.field_Qb.field_Mb = null;
                Ball.field_A.field_eb = true;
                ka.a(param4, IsaacGenerator.field_b, param2, param0, -108);
              } else {
                if (o.field_e.field_jc > o.field_e.field_cc) {
                  IsaacGenerator.field_b.field_Qb.field_Mb = null;
                  Ball.field_A.field_eb = true;
                  ka.a(param4, IsaacGenerator.field_b, param2, param0, -108);
                } else {
                  IsaacGenerator.field_b.field_Qb.field_Mb = GameCanvas.field_d;
                  Ball.field_A.field_eb = false;
                  jh.a(true, IsaacGenerator.field_b.field_Rb);
                }
              }
            }
          } else {
            if (Rasterizer2D.height == BallPulseEffect.framebuffer.height &&
              Rasterizer2D.width == BallPulseEffect.framebuffer.width) {
              if (o.field_e != null) {
                CacheIoRequest.a(true, false);
              } else {
                if (null != nl.field_f) {
                  CacheIoRequest.a(true, true);
                } else {
                  NanoGameClock.b(31);
                }
              }
            }
            if (param3) {
              qh.field_f = id.field_Pb;
              pq.a(-128, param3);
              if (ml.field_b > 0) {
                na.a(param8, param3, -94, param2);
              }
              AppletGameShell.field_e.field_S = 1;
              AppletGameShell.field_e.field_V = Paddle.field_C.field_V;
              if (0 < IntArrayRequest.field_j) {
                n.a(param2, param8, param3, (byte) -76);
              }
              if (TableDataRequest.field_m > 0) {
                nh.a(true, param3, param8, param2, param7);
              }
              if (hc.field_c &&
                o.field_e.field_jc <= o.field_e.field_cc) {
                IsaacGenerator.field_b.field_Qb.field_Mb = GameCanvas.field_d;
                Ball.field_A.field_eb = false;
                jh.a(true, IsaacGenerator.field_b.field_Rb);
              } else {
                IsaacGenerator.field_b.field_Qb.field_Mb = null;
                Ball.field_A.field_eb = true;
                ka.a(param4, IsaacGenerator.field_b, param2, param0, -108);
              }
            } else {
              qh.field_f = (kp.field_a - 640) / 2;
              pq.a(-128, param3);
              if (ml.field_b > 0) {
                na.a(param8, param3, -94, param2);
                AppletGameShell.field_e.field_S = 1;
                AppletGameShell.field_e.field_V = Paddle.field_C.field_V;
                if (0 < IntArrayRequest.field_j) {
                  n.a(param2, param8, param3, (byte) -76);
                }
                if (TableDataRequest.field_m > 0) {
                  nh.a(true, param3, param8, param2, param7);
                }
                if (hc.field_c &&
                  o.field_e.field_jc <= o.field_e.field_cc) {
                  IsaacGenerator.field_b.field_Qb.field_Mb = GameCanvas.field_d;
                  Ball.field_A.field_eb = false;
                  jh.a(true, IsaacGenerator.field_b.field_Rb);
                } else {
                  IsaacGenerator.field_b.field_Qb.field_Mb = null;
                  Ball.field_A.field_eb = true;
                  ka.a(param4, IsaacGenerator.field_b, param2, param0, -108);
                }
              } else {
                AppletGameShell.field_e.field_S = 1;
                AppletGameShell.field_e.field_V = Paddle.field_C.field_V;
                if (0 < IntArrayRequest.field_j) {
                  n.a(param2, param8, param3, (byte) -76);
                }
                if (TableDataRequest.field_m > 0) {
                  nh.a(true, param3, param8, param2, param7);
                }
                if (!hc.field_c) {
                  IsaacGenerator.field_b.field_Qb.field_Mb = null;
                  Ball.field_A.field_eb = true;
                  ka.a(param4, IsaacGenerator.field_b, param2, param0, -108);
                } else {
                  if (o.field_e.field_jc > o.field_e.field_cc) {
                    IsaacGenerator.field_b.field_Qb.field_Mb = null;
                    Ball.field_A.field_eb = true;
                    ka.a(param4, IsaacGenerator.field_b, param2, param0, -108);
                  } else {
                    IsaacGenerator.field_b.field_Qb.field_Mb = GameCanvas.field_d;
                    Ball.field_A.field_eb = false;
                    jh.a(true, IsaacGenerator.field_b.field_Rb);
                  }
                }
              }
            }
          }
        }
        um.a(param6, param9, param4, param0, param2, param1, (byte) -114);
        ka.a(param4, TimedSplashScreen.field_u, param2, param0, 121);
        if (param5 <= 6) {
          field_g = -90;
        }
        an.field_h = an.field_h + 1;
    }

    final static void a(int param0, int param1, int param2, int param3, PacketBuffer param4) {
        try {
          param4.writeByte(33, param1);
          param4.writeShort((byte) 115, 17);
          param4.writeShort((byte) 120, param0);
          param4.writeShort((byte) 107, param2);
          param4.writeByte(5, param3);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "c.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        var3 = this.field_k.length;
        if (param0 != 1) {
          return -35;
        }
        while (param1 >= var3) {
          if (!this.field_f) {
            var3 = var3 + this.field_b;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.field_b;
            continue;
          }
          var3 = 1;
        }
        return var3;
    }

    private final void a(int param0, int param1) {
        int[] var4 = new int[this.b(1, param0)];
        int[] var3 = var4;
        pm.a(this.field_k, 0, var4, 0, this.field_k.length);
        this.field_k = var4;
        if (param1 != -7877) {
          this.field_k = (int[]) null;
          return;
        }
    }

    private c() throws Throwable {
        throw new Error();
    }

    private final void a(int param0, int param1, int param2) {
        if (this.field_h < param2) {
          this.field_h = param2;
        }
        if (param1 != 0) {
          field_g = 55;
          if (param2 >= this.field_k.length) {
            this.a(param2, -7877);
            this.field_k[param2] = param0;
            return;
          }
          this.field_k[param2] = param0;
          return;
        }
        if (param2 < this.field_k.length) {
          this.field_k[param2] = param0;
          return;
        }
        this.a(param2, -7877);
        this.field_k[param2] = param0;
    }

    final void a(boolean param0, int param1) {
        if (!param0) {
          this.a(param1, 0, 1 + this.field_h);
          return;
        }
        this.a(-78, -117);
        this.a(param1, 0, 1 + this.field_h);
    }

    final int b(boolean param0) {
        if (!param0) {
          return -51;
        }
        return 1 + this.field_h;
    }

    final int a(int param0, byte param1) {
        if (this.field_h < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param1 == 64) {
          return this.field_k[param0];
        }
        field_c = (String) null;
        return this.field_k[param0];
    }

    static {
        field_g = 250;
        field_d = "Create";
        field_c = "Accept";
        field_n = "Real-life threats";
        field_m = new th(7, 0, 1, 1);
    }
}
