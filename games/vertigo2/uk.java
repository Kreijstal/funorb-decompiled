/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends ab {
    private int field_A;
    private byte[] field_g;
    static Sprite[] field_r;
    static od field_v;
    private int field_z;
    private DiskCacheWorker field_p;
    private ArchiveRequest field_s;
    private jl field_q;
    static UiPanel field_e;
    private ArchiveNetworkClient field_w;
    private int field_t;
    static String field_u;
    private SectorCacheStore field_k;
    private SectorCacheStore field_i;
    static String field_y;
    private ff field_x;
    private byte[] field_l;
    private IntrusiveDeque field_j;
    private boolean field_m;
    private IntrusiveDeque field_h;
    private int field_B;
    private boolean field_n;
    private long field_o;
    private boolean field_f;

    final static void d(byte param0) {
        double var2 = 0.0;
        int var1_int = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        int var1_intLifetime1;
        try {
          if (null == eh.field_b ||
            null == JaggrabClient.field_b) {
            JaggrabClient.field_b = new int[256];
            eh.field_b = new int[256];
            for (var1_int = 0; 256 > var1_int; var1_int++) {
              var2 = 6.283185307179586 * ((double)var1_int / 255.0);
              eh.field_b[var1_int] = (int)(4096.0 * Math.sin(var2));
              JaggrabClient.field_b[var1_int] = (int)(Math.cos(var2) * 4096.0);
            }
          }
          var1_intLifetime1 = -28 / ((param0 + 6) / 43);
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "uk.D(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        if (null == this.field_i) {
          return;
        }
        this.field_n = true;
        if (this.field_j == null) {
          this.field_j = new IntrusiveDeque();
        }
        if (param0 < 74) {
          this.field_h = (IntrusiveDeque) null;
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_u = null;
        field_v = null;
        field_e = null;
        field_y = null;
        field_r = null;
        int var1 = -43 % ((param0 - 23) / 39);
    }

    final byte[] a(boolean param0, int param1) {
        if (!param0) {
          uk.clearStaticReferences((byte) 0);
        }
        ArchiveRequest var3 = this.a(101, 0, param1);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.getData((byte) -106);
        var3.unlink(2);
        return var4;
    }

    final void c(byte param0) {
        ArchiveRequest discarded$0 = null;
        ArchiveRequest discarded$1 = null;
        IntrusiveNode var2;
        int var3;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (null == this.field_j) {
          return;
        }
        if (param0 != -94) {
          return;
        }
        if (this.a(true) == null) {
          return;
        }
        var2 = this.field_h.beginBackward((byte) 100);
        while (var2 != null) {
          var3 = (int)var2.key;
          if (var3 >= 0 &&
            var3 < this.field_x.field_p &&
            this.field_x.field_h[var3] != 0) {
            if (this.field_g[var3] == 0) {
              discarded$0 = this.a(101, 1, var3);
            }
            if (this.field_g[var3] == -1) {
              discarded$1 = this.a(-66, 2, var3);
            }
            if (1 == this.field_g[var3]) {
              var2.unlink(2);
            }
          } else {
            var2.unlink(param0 + 96);
          }
          var2 = this.field_h.nextBackward(27);
        }
    }

    final void b(int param0) {
        ArchiveRequest discarded$1 = null;
        ArchiveRequest discarded$0 = null;
        ArchiveRequest discarded$3 = null;
        ArchiveRequest discarded$2 = null;
        int var2_int;
        ArchiveRequest var2;
        IntrusiveNode var3;
        int var4;
        int var5;
        IntrusiveNode var6;
        IntrusiveNode var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        IntrusiveNode var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (null != this.field_j) {
          if (this.a(true) == null) {
            return;
          }
          if (this.field_m) {
            var2_int = 1;
            var3 = this.field_j.beginBackward((byte) 100);
            while (var3 != null) {
              var4 = (int)var3.key;
              if (this.field_g[var4] == 0) {
                discarded$1 = this.a(112, 1, var4);
              }
              if (0 == this.field_g[var4]) {
                var2_int = 0;
              } else {
                var3.unlink(2);
              }
              var3 = this.field_j.nextBackward(27);
            }
            while (this.field_B < this.field_x.field_h.length) {
              if (this.field_x.field_h[this.field_B] == 0) {
                this.field_B = this.field_B + 1;
                continue;
              }
              if (this.field_p.field_d < 250) {
                if (this.field_g[this.field_B] == 0) {
                  discarded$0 = this.a(92, 1, this.field_B);
                }
                if (this.field_g[this.field_B] == 0) {
                  var7 = new IntrusiveNode();
                  var7.key = (long)this.field_B;
                  var2_int = 0;
                  this.field_j.addFirst(var7, false);
                }
                this.field_B = this.field_B + 1;
                continue;
              }
              var2_int = 0;
              break;
            }
            if ((var2_int != 0)) {
              this.field_B = 0;
              this.field_m = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_n) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_j.beginBackward((byte) 100);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.key;
                if (this.field_g[var4Lifetime1] != 1) {
                  discarded$3 = this.a(123, 2, var4Lifetime1);
                }
                if (this.field_g[var4Lifetime1] == 1) {
                  var3Lifetime1.unlink(2);
                } else {
                  var2_intLifetime1 = 0;
                }
                var3Lifetime1 = this.field_j.nextBackward(88);
              }
              while (this.field_B < this.field_x.field_h.length) {
                if (this.field_x.field_h[this.field_B] == 0) {
                  this.field_B = this.field_B + 1;
                  continue;
                }
                if (!this.field_w.isPrefetchQueueFull(6)) {
                  if (this.field_g[this.field_B] != 1) {
                    discarded$2 = this.a(-102, 2, this.field_B);
                  }
                  if (1 != this.field_g[this.field_B]) {
                    var6 = new IntrusiveNode();
                    var6.key = (long)this.field_B;
                    this.field_j.addFirst(var6, false);
                    var2_intLifetime1 = 0;
                  }
                  this.field_B = this.field_B + 1;
                  continue;
                }
                var2_intLifetime1 = 0;
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_n = false;
                this.field_B = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_j = null;
            }
          }
        }
        if (param0 < 86) {
          this.a((byte) 81);
        }
        if (this.field_f &&
          gk.correctedCurrentTimeMillis(85) >= this.field_o) {
          var2 = (ArchiveRequest) (this.field_q.b(0));
          while (var2 != null) {
            if (!var2.field_z) {
              if (var2.field_t) {
                if (!var2.field_u) {
                  throw new RuntimeException();
                }
                var2.unlink(2);
              } else {
                var2.field_t = true;
              }
            }
            var2 = (ArchiveRequest) (this.field_q.c(-86));
          }
          this.field_o = 1000L + gk.correctedCurrentTimeMillis(127);
        }
    }

    final ff a(boolean param0) {
        Object stackIn_31_0;
        ArchiveNetworkClient stackIn_31_1;
        int stackIn_31_2;
        int stackIn_31_3;
        boolean stackIn_31_4;
        int stackIn_31_5;
        Object stackIn_32_0;
        boolean stackIn_32_6;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (null != this.field_x) {
          return this.field_x;
        }
        if (this.field_s == null) {
          if (this.field_w.isPriorityQueueFull(20)) {
            return null;
          }
          this.field_s = (ArchiveRequest) ((Object) this.field_w.enqueueRequest(this.field_t, 255, true, (byte) 0, false));
        }
        if (this.field_s.field_z) {
          return null;
        }
        var7 = this.field_s.getData((byte) -106);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (!param0) {
          this.field_l = (byte[]) null;
        }
        if (!(this.field_s instanceof DiskArchiveRequest)) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_x = new ff(var7, this.field_z, this.field_l);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_w.resetAfterValidationFailure(0);
            this.field_x = null;
            if (!this.field_w.isPriorityQueueFull(20)) {
              stackIn_31_0 = this;
              stackIn_31_1 = this.field_w;
              stackIn_31_2 = this.field_t;
              stackIn_31_3 = 255;
              stackIn_31_4 = true;
              stackIn_31_5 = 0;
              if (param0) {
                stackIn_32_0 = this;
                stackIn_32_6 = false;
              } else {
                stackIn_32_0 = this;
                stackIn_32_6 = true;
              }
              this.field_s = (ArchiveRequest) ((Object) ((ArchiveNetworkClient) (Object) stackIn_31_1).enqueueRequest(stackIn_31_2, stackIn_31_3, stackIn_31_4, (byte) stackIn_31_5, stackIn_32_6));
            } else {
              this.field_s = null;
            }
            return null;
          }
          if (this.field_k != null) {
            this.field_p.requestWrite(-19932, this.field_t, this.field_k, var7);
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_x = new ff(var7, this.field_z, this.field_l);
            if (this.field_x.field_c != this.field_A) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_x = null;
            if (!this.field_w.isPriorityQueueFull(20)) {
              this.field_s = (ArchiveRequest) ((Object) this.field_w.enqueueRequest(this.field_t, 255, true, (byte) 0, false));
            } else {
              this.field_s = null;
            }
            return null;
          }
        }
        if (this.field_i != null) {
          this.field_g = new byte[this.field_x.field_p];
        }
        this.field_s = null;
        return this.field_x;
    }

    private final ArchiveRequest a(int param0, int param1, int param2) {
        Object stackIn_59_0 = null;
        Throwable decompiledCaughtException = null;
        int var4 = 0;
        Object var5 = null;
        byte[] var6 = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        Exception var7_ref = null;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ArchiveRequest var13 = null;
        byte[] var14 = null;
        byte[] var19 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        byte[] var31 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        var4 = 38 / ((33 - param0) / 55);
        var13 = (ArchiveRequest) (this.field_q.a((long)param2, (byte) 64));
        var5 = var13;
        if (var13 != null &&
          0 == param1 &&
          !var13.field_u &&
          var13.field_z) {
          var13.unlink(2);
          var5 = null;
        }
        if (var5 == null) {
          if (0 != param1) {
            if (param1 != 1) {
              if (param1 != 2) {
                throw new RuntimeException();
              }
              if (this.field_i == null) {
                throw new RuntimeException();
              }
              if (this.field_g[param2] != -1) {
                throw new RuntimeException();
              }
              if (this.field_w.isPrefetchQueueFull(6)) {
                return null;
              }
              var5 = this.field_w.enqueueRequest(param2, this.field_t, false, (byte) 2, false);
            } else {
              if (null == this.field_i) {
                throw new RuntimeException();
              }
              var5 = this.field_p.requestRead(this.field_i, param2, (byte) 48);
            }
          } else {
            if (this.field_i != null &&
              -1 != this.field_g[param2]) {
              var5 = this.field_p.readNow(true, this.field_i, param2);
            } else {
              if (this.field_w.isPriorityQueueFull(20)) {
                return null;
              }
              var5 = this.field_w.enqueueRequest(param2, this.field_t, true, (byte) 2, false);
            }
          }
          this.field_q.a((IntrusiveNode) (var5), (long)param2, false);
        }
        if (((ArchiveRequest) (var5)).field_z) {
          return null;
        }
        var19 = ((ArchiveRequest) (var5)).getData((byte) -106);
        var14 = var19;
        var6 = var14;
        if (var5 instanceof DiskArchiveRequest) {
          try {
            if (var6 != null &&
              var19.length > 2) {
              kc.field_d.reset();
              kc.field_d.update(var6, 0, -2 + var19.length);
              var7_int = (int)kc.field_d.getValue();
              if (this.field_x.field_j[param2] != var7_int) {
                throw new RuntimeException();
              }
              if (null != this.field_x.field_s &&
                this.field_x.field_s[param2] != null) {
                var28 = this.field_x.field_s[param2];
                var29 = DebouncedFieldValidator.a(0, (byte) -91, -2 + var19.length, var19);
                for (var10 = 0; var10 < 64; var10++) {
                  if (var28[var10] != var29[var10]) {
                    throw new RuntimeException();
                  }
                }
              }
              var8 = (var6[var19.length - 1] & 255) + ((var6[var19.length - 2] & 255) << 8);
              if ((this.field_x.field_l[param2] & 65535) != var8) {
                throw new RuntimeException();
              }
              if (this.field_g[param2] != 1) {
                if (this.field_g[param2] == 0) {
                }
                this.field_g[param2] = (byte) 1;
              }
              if (!((ArchiveRequest) (var5)).field_u) {
                ((ArchiveRequest) (var5)).unlink(2);
              }
              stackIn_59_0 = var5;
              return (ArchiveRequest) (stackIn_59_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var7_ref = (Exception) (Object) decompiledCaughtException;
            this.field_g[param2] = (byte)-1;
            ((ArchiveRequest) (var5)).unlink(2);
            if (((ArchiveRequest) (var5)).field_u &&
              !this.field_w.isPriorityQueueFull(20)) {
              var5 = this.field_w.enqueueRequest(param2, this.field_t, true, (byte) 2, false);
              this.field_q.a((IntrusiveNode) (var5), (long)param2, false);
            }
            return null;
          }
        }
        try {
          if (var6 != null &&
            var19.length > 2) {
            kc.field_d.reset();
            kc.field_d.update(var6, 0, var19.length - 2);
            var7_int = (int)kc.field_d.getValue();
            if (this.field_x.field_j[param2] != var7_int) {
              throw new RuntimeException();
            }
            if (null != this.field_x.field_s &&
              this.field_x.field_s[param2] != null) {
              var31 = this.field_x.field_s[param2];
              var30 = DebouncedFieldValidator.a(0, (byte) -126, var19.length - 2, var19);
              var12 = 0;
              var10 = var12;
              while (var12 < 64) {
                if (~var30[var12] != ~var31[var12]) {
                  throw new RuntimeException();
                }
                var12++;
              }
            }
            this.field_w.field_m = 0;
            this.field_w.field_j = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_w.resetAfterValidationFailure(0);
          ((ArchiveRequest) (var5)).unlink(2);
          if (!((ArchiveRequest) (var5)).field_u) {
            return null;
          }
          if (!this.field_w.isPriorityQueueFull(20)) {
            var5 = this.field_w.enqueueRequest(param2, this.field_t, true, (byte) 2, false);
            this.field_q.a((IntrusiveNode) (var5), (long)param2, false);
          }
          return null;
        }
        var6[-2 + var19.length] = (byte)(this.field_x.field_l[param2] >>> 8);
        var6[var19.length - 1] = (byte)this.field_x.field_l[param2];
        if (null != this.field_i) {
          this.field_p.requestWrite(-19932, param2, this.field_i, var19);
          if (this.field_g[param2] != 1) {
            this.field_g[param2] = (byte) 1;
          }
        }
        if (!((ArchiveRequest) (var5)).field_u) {
          ((ArchiveRequest) (var5)).unlink(2);
        }
        return (ArchiveRequest) (var5);
    }

    final static void a(Archive param0, Archive param1, int param2) {
        try {
          if (param2 < 115) {
            field_u = (String) null;
          }
          oc.field_r = param0;
          hd.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "uk.I(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int getGroupRequestProgressPercent(int param0, int param1) {
        if (param1 != 57) {
          return 100;
        }
        ArchiveRequest var3 = (ArchiveRequest) (this.field_q.a((long)param0, (byte) 64));
        if (var3 == null) {
          return 0;
        }
        return var3.getProgressPercent(109);
    }

    uk(int param0, SectorCacheStore param1, SectorCacheStore param2, ArchiveNetworkClient param3, DiskCacheWorker param4, int param5, byte[] param6, int param7, boolean param8) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_q = new jl(16);
        this.field_B = 0;
        this.field_h = new IntrusiveDeque();
        this.field_o = 0L;
        try {
          this.field_t = param0;
          this.field_i = param1;
          if (null == this.field_i) {
            this.field_m = false;
          } else {
            this.field_m = true;
            this.field_j = new IntrusiveDeque();
          }
          this.field_l = param6;
          this.field_w = param3;
          stackIn_7_1 = (param8);
          this.field_f = stackIn_7_1;
          this.field_A = param7;
          this.field_z = param5;
          this.field_k = param2;
          this.field_p = param4;
          if (this.field_k != null) {
            this.field_s = (ArchiveRequest) ((Object) this.field_p.readNow(true, this.field_k, this.field_t));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("uk.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_y = "No options available";
    }
}
