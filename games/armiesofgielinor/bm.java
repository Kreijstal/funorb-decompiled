/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends ew {
    private int field_r;
    private int field_j;
    static String field_z;
    static int field_p;
    private SectorCacheStore field_w;
    private NodeHashTable field_t;
    private int field_B;
    private byte[] field_C;
    static SpellMenuGroup spellMenuRoot;
    private ResourceProtocolClient field_x;
    static String field_k;
    static int field_h;
    static int[][] field_y;
    private SectorCacheStore field_f;
    private byte[] field_g;
    private jm field_q;
    private ResourceRequest field_n;
    private DiskCacheWorker field_A;
    private int field_s;
    private NodeDeque field_i;
    private boolean field_o;
    private boolean field_u;
    private NodeDeque field_m;
    private boolean field_l;
    private long field_v;

    final void b(int param0) {
        ResourceRequest discarded$3 = null;
        ResourceRequest discarded$2 = null;
        ResourceRequest discarded$1 = null;
        ResourceRequest discarded$0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var2_int = 0;
        ResourceRequest var2_ref = null;
        RuntimeException var2_ref2 = null;
        IntrusiveNode var3 = null;
        int var4 = 0;
        int var5 = 0;
        IntrusiveNode var6 = null;
        IntrusiveNode var7 = null;
        IntrusiveNode var3Lifetime1;
        int var2_intLifetime1;
        int var4Lifetime1;
        var2 = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != -26132) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_i != null) {
            if (null == this.a(param0 ^ -10433)) {
              return;
            }
            if (this.field_o) {
              var2_int = 1;
              var3 = this.field_i.first((byte) 101);
              while (var3 != null) {
                var4 = (int)var3.key;
                if (0 == this.field_C[var4]) {
                  discarded$3 = this.a(1, var4, 1);
                }
                if (this.field_C[var4] == 0) {
                  var2_int = 0;
                } else {
                  var3.unlink(-115);
                }
                var3 = this.field_i.next((byte) 123);
              }
              while (this.field_s < this.field_q.field_p.length) {
                if (this.field_q.field_p[this.field_s] == 0) {
                  this.field_s = this.field_s + 1;
                  continue;
                }
                if (250 > this.field_A.queuedCount) {
                  if (this.field_C[this.field_s] == 0) {
                    discarded$2 = this.a(1, this.field_s, 1);
                  }
                  if (this.field_C[this.field_s] == 0) {
                    var6 = new IntrusiveNode();
                    var6.key = (long)this.field_s;
                    var2_int = 0;
                    this.field_i.addLast((byte) -119, var6);
                  }
                  this.field_s = this.field_s + 1;
                  continue;
                }
                var2_int = 0;
                break;
              }
              if ((var2_int != 0)) {
                this.field_s = 0;
                this.field_o = false;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.field_u) {
                var2_intLifetime1 = 1;
                var3Lifetime1 = this.field_i.first((byte) 92);
                while (var3Lifetime1 != null) {
                  var4Lifetime1 = (int)var3Lifetime1.key;
                  if (1 != this.field_C[var4Lifetime1]) {
                    discarded$1 = this.a(1, var4Lifetime1, 2);
                  }
                  if (this.field_C[var4Lifetime1] != 1) {
                    var2_intLifetime1 = 0;
                  } else {
                    var3Lifetime1.unlink(param0 ^ 26237);
                  }
                  var3Lifetime1 = this.field_i.next((byte) 123);
                }
                scanLoop1: while (true) {
                  if (this.field_q.field_p.length > this.field_s) {
                    if (0 != this.field_q.field_p[this.field_s]) {
                      if (this.field_x.isNormalFull((byte) 51)) {
                        var2_intLifetime1 = 0;
                        break scanLoop1;
                      }
                      if (this.field_C[this.field_s] != 1) {
                        discarded$0 = this.a(1, this.field_s, 2);
                      }
                      if (this.field_C[this.field_s] != 1) {
                        var7 = new IntrusiveNode();
                        var7.key = (long)this.field_s;
                        this.field_i.addLast((byte) -119, var7);
                        var2_intLifetime1 = 0;
                      }
                    }
                    this.field_s = this.field_s + 1;
                    continue;
                  }
                  break;
                }
                if ((var2_intLifetime1 != 0)) {
                  this.field_u = false;
                  this.field_s = 0;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_i = null;
              }
            }
          }
          if (this.field_l) {
            if (this.field_v > vi.b(param0 + 26060)) {
              return;
            }
            var2_ref = (ResourceRequest) (this.field_t.first(1));
            while (var2_ref != null) {
              if (!var2_ref.pending) {
                if (var2_ref.field_w) {
                  if (!var2_ref.requestFlag) {
                    throw new RuntimeException();
                  }
                  var2_ref.unlink(-128);
                } else {
                  var2_ref.field_w = true;
                }
              }
              var2_ref = (ResourceRequest) (this.field_t.next((byte) 127));
            }
            this.field_v = 1000L + vi.b(65);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var2_ref2), "bm.K(" + param0 + ')');
        }
    }

    final jm a(int param0) {
        jm stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_41_0 = null;
        jm stackIn_53_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_q != null) {
            stackIn_3_0 = this.field_q;
            return stackIn_3_0;
          }
          if (null == this.field_n) {
            if (this.field_x.isPriorityFull(101)) {
              stackIn_9_0 = null;
              return (jm) (stackIn_9_0);
            }
            this.field_n = (ResourceRequest) ((Object) this.field_x.request(this.field_r, false, 255, (byte) 0, true));
          }
          if (this.field_n.pending) {
            return null;
          }
          var7 = this.field_n.getBytes((byte) -119);
          var6 = var7;
          var5 = var6;
          var2 = var5;
          if (!(this.field_n instanceof DiskCacheRequest)) {
            try {
              if (var5 == null) {
                throw new RuntimeException();
              }
              this.field_q = new jm(var7, this.field_B, this.field_g);
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
              this.field_x.invalidateTransport((byte) 4);
              this.field_q = null;
              if (this.field_x.isPriorityFull(param0 - 20152)) {
                this.field_n = null;
              } else {
                this.field_n = (ResourceRequest) ((Object) this.field_x.request(this.field_r, false, 255, (byte) 0, true));
              }
              stackIn_41_0 = null;
              return (jm) (stackIn_41_0);
            }
            if (null != this.field_f) {
              this.field_A.queueWrite(this.field_r, this.field_f, false, var7);
            }
          } else {
            try {
              if (var5 == null) {
                throw new RuntimeException();
              }
              this.field_q = new jm(var7, this.field_B, this.field_g);
              if (this.field_j != this.field_q.field_c) {
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = decompiledCaughtException;
              this.field_q = null;
              if (!this.field_x.isPriorityFull(92)) {
                this.field_n = (ResourceRequest) ((Object) this.field_x.request(this.field_r, false, 255, (byte) 0, true));
              } else {
                this.field_n = null;
              }
              stackIn_29_0 = null;
              return (jm) (stackIn_29_0);
            }
          }
          this.field_n = null;
          if (null != this.field_w) {
            this.field_C = new byte[this.field_q.field_i];
          }
          if (param0 != 20179) {
            field_k = (String) null;
          }
          stackIn_53_0 = this.field_q;
          return stackIn_53_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2_ref = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var2_ref), "bm.B(" + param0 + ')');
        }
    }

    private final ResourceRequest a(int param0, int param1, int param2) {
        ResourceRequest stackIn_3_0 = null;
        Object stackIn_76_0 = null;
        Object stackIn_84_0 = null;
        Object stackIn_112_0 = null;
        Object stackIn_120_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ResourceRequest var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 1) {
            stackIn_3_0 = (ResourceRequest) null;
            return stackIn_3_0;
          }
          var12 = (ResourceRequest) (this.field_t.get(-67, (long)param1));
          var4 = var12;
          if (var12 != null &&
            0 == param2 &&
            !var12.requestFlag &&
            var12.pending) {
            var12.unlink(35);
            var4 = null;
          }
          if (var4 == null) {
            if (param2 == 0) {
              if (null != this.field_w &&
                this.field_C[param1] != -1) {
                var4 = this.field_A.readNow(param1, this.field_w, 86);
              } else {
                if (this.field_x.isPriorityFull(64)) {
                  return null;
                }
                var4 = this.field_x.request(param1, false, this.field_r, (byte) 2, true);
              }
            } else {
              if (1 != param2) {
                if (param2 != 2) {
                  throw new RuntimeException();
                }
                if (this.field_w == null) {
                  throw new RuntimeException();
                }
                if (this.field_C[param1] != -1) {
                  throw new RuntimeException();
                }
                if (this.field_x.isNormalFull((byte) 51)) {
                  return null;
                }
                var4 = this.field_x.request(param1, false, this.field_r, (byte) 2, false);
              } else {
                if (this.field_w == null) {
                  throw new RuntimeException();
                }
                var4 = this.field_A.queueRead((byte) 56, param1, this.field_w);
              }
            }
            this.field_t.put((IntrusiveNode) (var4), (long)param1, 108);
          }
          if (((ResourceRequest) (var4)).pending) {
            return null;
          }
          var18 = ((ResourceRequest) (var4)).getBytes((byte) -86);
          var13 = var18;
          var5 = var13;
          if (var4 instanceof DiskCacheRequest) {
            try {
              if (var5 != null &&
                var18.length > 2) {
                ab.field_b.reset();
                ab.field_b.update(var5, 0, -2 + var18.length);
                var6_int = (int)ab.field_b.getValue();
                if (var6_int != this.field_q.field_e[param1]) {
                  throw new RuntimeException();
                }
                if (this.field_q.field_v != null &&
                  null != this.field_q.field_v[param1]) {
                  var27 = this.field_q.field_v[param1];
                  var28 = SpellCastAction.a(param0 ^ -18424, -2 + var18.length, var18, 0);
                  for (var9 = 0; var9 < 64; var9++) {
                    if (~var27[var9] != ~var28[var9]) {
                      throw new RuntimeException();
                    }
                  }
                }
                var7 = (255 & var5[var18.length - 1]) + (65280 & var5[-2 + var18.length] << 8);
                if ((65535 & this.field_q.field_t[param1]) != var7) {
                  throw new RuntimeException();
                }
                if (this.field_C[param1] != 1) {
                  if (this.field_C[param1] == 0) {
                  }
                  this.field_C[param1] = (byte) 1;
                }
                if (!((ResourceRequest) (var4)).requestFlag) {
                  ((ResourceRequest) (var4)).unlink(param0 ^ -99);
                }
                stackIn_76_0 = var4;
                return (ResourceRequest) (stackIn_76_0);
              }
              throw new RuntimeException();
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6_ref = (Exception) (Object) decompiledCaughtException;
              this.field_C[param1] = (byte)-1;
              ((ResourceRequest) (var4)).unlink(116);
              if (((ResourceRequest) (var4)).requestFlag) {
                if (this.field_x.isPriorityFull(18)) {
                  return null;
                }
                var4 = this.field_x.request(param1, false, this.field_r, (byte) 2, true);
                this.field_t.put((IntrusiveNode) (var4), (long)param1, 98);
              }
              stackIn_84_0 = null;
              return (ResourceRequest) (stackIn_84_0);
            }
          }
          try {
            if (var5 != null &&
              var18.length > 2) {
              ab.field_b.reset();
              ab.field_b.update(var5, 0, var18.length - 2);
              var6_int = (int)ab.field_b.getValue();
              if (var6_int != this.field_q.field_e[param1]) {
                throw new RuntimeException();
              }
              if (null != this.field_q.field_v &&
                this.field_q.field_v[param1] != null) {
                var29 = this.field_q.field_v[param1];
                var30 = SpellCastAction.a(-18423, -2 + var18.length, var18, 0);
                var11 = 0;
                var9 = var11;
                while (var11 < 64) {
                  if (var29[var11] != var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              this.field_x.errorCount = 0;
              this.field_x.errorCode = 0;
            } else {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            this.field_x.invalidateTransport((byte) 4);
            ((ResourceRequest) (var4)).unlink(-109);
            if (((ResourceRequest) (var4)).requestFlag &&
              !this.field_x.isPriorityFull(59)) {
              var4 = this.field_x.request(param1, false, this.field_r, (byte) 2, true);
              this.field_t.put((IntrusiveNode) (var4), (long)param1, 120);
            }
            stackIn_112_0 = null;
            return (ResourceRequest) (stackIn_112_0);
          }
          var5[-2 + var18.length] = (byte)(this.field_q.field_t[param1] >>> 8);
          var5[-1 + var18.length] = (byte)this.field_q.field_t[param1];
          if (null != this.field_w) {
            this.field_A.queueWrite(param1, this.field_w, false, var18);
            if (this.field_C[param1] != 1) {
              this.field_C[param1] = (byte) 1;
            }
          }
          if (!((ResourceRequest) (var4)).requestFlag) {
            ((ResourceRequest) (var4)).unlink(105);
          }
          stackIn_120_0 = var4;
          return (ResourceRequest) (stackIn_120_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) (var4), "bm.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        try {
          if (param0 > -43) {
            bm.e(41);
          }
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "bm.J(" + param0 + ',' + param1 + ')');
        }
    }

    final byte[] a(int param0, int param1) {
        ResourceRequest var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.a(1, param0, 0);
          if (var3 == null) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          if (param1 != 4) {
            this.b(-9);
          }
          var4 = var3.getBytes((byte) -113);
          var3.unlink(121);
          stackIn_6_0 = var4;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var3_ref), "bm.C(" + param0 + ',' + param1 + ')');
        }
    }

    final int b(int param0, int param1) {
        ResourceRequest var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (ResourceRequest) (this.field_t.get(param0 - 5958, (long)param1));
          if (var3 != null) {
            stackIn_2_0 = var3.getProgress(0);
            return stackIn_2_0;
          }
          if (param0 == 5926) {
            stackIn_7_0 = 0;
            return stackIn_7_0;
          }
          stackIn_5_0 = 68;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var3_ref), "bm.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void e(int param0) {
        field_k = null;
        spellMenuRoot = null;
        if (param0 > -33) {
          return;
        }
        try {
          field_z = null;
          field_y = (int[][]) null;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "bm.H(" + param0 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_w == null) {
            return;
          }
          this.field_u = true;
          if (param0 != 31637) {
            this.a(-26);
          }
          if (null == this.field_i) {
            this.field_i = new NodeDeque();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var2), "bm.G(" + param0 + ')');
        }
    }

    final void d(int param0) {
        ResourceRequest discarded$0 = null;
        ResourceRequest discarded$1 = null;
        RuntimeException decompiledCaughtException = null;
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_i == null) {
            return;
          }
          if (null == this.a(20179)) {
            return;
          }
          var3 = 1 % ((72 - param0) / 39);
          var2 = this.field_m.first((byte) 120);
          while (var2 != null) {
            var4 = (int)var2.key;
            if (var4 >= 0) {
              if (var4 < this.field_q.field_i) {
                if (this.field_q.field_p[var4] != 0) {
                  if (0 == this.field_C[var4]) {
                    discarded$0 = this.a(1, var4, 1);
                  }
                  if (this.field_C[var4] == -1) {
                    discarded$1 = this.a(1, var4, 2);
                  }
                  if (1 == this.field_C[var4]) {
                    var2.unlink(-121);
                  }
                } else {
                  var2.unlink(-111);
                }
              } else {
                var2.unlink(-111);
              }
            } else {
              var2.unlink(-111);
            }
            var2 = this.field_m.next((byte) 123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var2_ref), "bm.L(" + param0 + ')');
        }
    }

    bm(int param0, SectorCacheStore param1, SectorCacheStore param2, ResourceProtocolClient param3, DiskCacheWorker param4, int param5, byte[] param6, int param7, boolean param8) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_t = new NodeHashTable(16);
        this.field_s = 0;
        this.field_m = new NodeDeque();
        this.field_v = 0L;
        try {
          this.field_r = param0;
          this.field_w = param1;
          if (this.field_w != null) {
            this.field_o = true;
            this.field_i = new NodeDeque();
          } else {
            this.field_o = false;
          }
          this.field_B = param5;
          this.field_j = param7;
          this.field_g = param6;
          stackIn_7_1 = (param8);
          this.field_l = stackIn_7_1;
          this.field_f = param2;
          this.field_x = param3;
          this.field_A = param4;
          if (null != this.field_f) {
            this.field_n = (ResourceRequest) ((Object) this.field_A.readNow(this.field_r, this.field_f, 114));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("bm.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_19_0 = stackIn_15_0;
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_20_0 = stackIn_19_0;
            stackIn_20_2 = "null";
          } else {
            stackIn_20_0 = stackIn_15_0;
            stackIn_20_2 = "{...}";
          }
          stackIn_23_0 = stackIn_20_0;
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param3 == null) {
            stackIn_24_0 = stackIn_23_0;
            stackIn_24_2 = "null";
          } else {
            stackIn_24_0 = stackIn_20_0;
            stackIn_24_2 = "{...}";
          }
          stackIn_27_0 = stackIn_24_0;
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param4 == null) {
            stackIn_28_0 = stackIn_27_0;
            stackIn_28_2 = "null";
          } else {
            stackIn_28_0 = stackIn_24_0;
            stackIn_28_2 = "{...}";
          }
          stackIn_31_0 = stackIn_28_0;
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_32_0 = stackIn_31_0;
            stackIn_32_2 = "null";
          } else {
            stackIn_32_0 = stackIn_28_0;
            stackIn_32_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_y = new int[][]{new int[]{0, -10}, new int[]{-20, 0}, new int[]{20, 0}, new int[]{0, 10}};
        field_z = "Connection lost - attempting to reconnect";
        field_k = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
