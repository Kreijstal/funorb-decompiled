/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CachedArchiveProvider extends ArchiveProvider {
    private byte[] field_f;
    private int field_p;
    static String[] field_r;
    private byte[] field_g;
    private int field_l;
    private ArchiveIndex field_m;
    private int field_s;
    private Js5Transport field_t;
    private SectorCacheStore field_o;
    private ArchiveRequest field_y;
    private IntrusiveNodeHashTable field_q;
    private DiskCacheWorker field_k;
    private SectorCacheStore field_x;
    private boolean field_v;
    private IntrusiveDeque field_e;
    private IntrusiveDeque field_u;
    private boolean field_j;
    private int field_z;
    static int field_n;
    private long field_h;
    private boolean field_i;
    static IndexedSprite[] field_w;

    final void c(int param0) {
        int var5 = EscapeVector.obfuscationControl;
        if (param0 >= -21) {
          this.getEncodedGroup((byte) -107, 43);
        }
        if (null != this.field_u) {
          if (null == this.getIndex(29192)) {
            return;
          }
          if (this.field_v) {
            boolean var2_int = true;
            IntrusiveNode var3 = this.field_u.first(false);
            while (var3 != null) {
              int var4 = (int)var3.key;
              if (this.field_f[var4] == 0) {
                ArchiveRequest discarded$3 = this.a(var4, 1, 23874);
              }
              if (this.field_f[var4] != 0) {
                var3.unlink((byte) -53);
              } else {
                var2_int = false;
              }
              var3 = this.field_u.next((byte) 70);
            }
            scanLoop1: while (true) {
              if (this.field_m.groupFileCounts.length > this.field_z) {
                if (this.field_m.groupFileCounts[this.field_z] != 0) {
                  if (250 <= this.field_k.field_f) {
                    var2_int = false;
                    break scanLoop1;
                  }
                  if (0 == this.field_f[this.field_z]) {
                    ArchiveRequest discarded$2 = this.a(this.field_z, 1, 23874);
                  }
                  if (this.field_f[this.field_z] == 0) {
                    IntrusiveNode var6 = new IntrusiveNode();
                    var6.key = (long)this.field_z;
                    this.field_u.addLast(-12328, var6);
                    var2_int = false;
                  }
                }
                this.field_z = this.field_z + 1;
                continue;
              }
              break;
            }
            if (var2_int) {
              this.field_z = 0;
              this.field_v = false;
            }
          } else if (this.field_j) {
            boolean var2_intLifetime1 = true;
            IntrusiveNode var3Lifetime1 = this.field_u.first(false);
            while (var3Lifetime1 != null) {
              int var4Lifetime1 = (int)var3Lifetime1.key;
              if (this.field_f[var4Lifetime1] != 1) {
                ArchiveRequest discarded$1 = this.a(var4Lifetime1, 2, 23874);
              }
              if (this.field_f[var4Lifetime1] != 1) {
                var2_intLifetime1 = false;
              } else {
                var3Lifetime1.unlink((byte) -24);
              }
              var3Lifetime1 = this.field_u.next((byte) 70);
            }
            while (this.field_z < this.field_m.groupFileCounts.length) {
              if (this.field_m.groupFileCounts[this.field_z] == 0) {
                this.field_z = this.field_z + 1;
                continue;
              }
              if (!this.field_t.b(20)) {
                if (this.field_f[this.field_z] != 1) {
                  ArchiveRequest discarded$0 = this.a(this.field_z, 2, 23874);
                }
                if (1 != this.field_f[this.field_z]) {
                  IntrusiveNode var7 = new IntrusiveNode();
                  var7.key = (long)this.field_z;
                  var2_intLifetime1 = false;
                  this.field_u.addLast(-12328, var7);
                }
                this.field_z = this.field_z + 1;
                continue;
              }
              var2_intLifetime1 = false;
              break;
            }
            if (var2_intLifetime1) {
              this.field_j = false;
              this.field_z = 0;
            }
            boolean decompiledFrameRemainder0 = false;
          } else {
            this.field_u = null;
          }
        }
        if (!this.field_i) {
          return;
        }
        if (td.b(128) < this.field_h) {
          return;
        }
        ArchiveRequest var2 = (ArchiveRequest) (this.field_q.first(false));
        while (var2 != null) {
          if (!var2.field_u) {
            if (var2.field_s) {
              if (!var2.field_r) {
                throw new RuntimeException();
              }
              var2.unlink((byte) -117);
            } else {
              var2.field_s = true;
            }
          }
          var2 = (ArchiveRequest) (this.field_q.next((byte) 62));
        }
        this.field_h = td.b(128) + 1000L;
        return;
    }

    final byte[] getEncodedGroup(byte guard, int groupId) {
        ArchiveRequest var3 = this.a(groupId, 0, 23874);
        if (var3 == null) {
          return null;
        }
        if (guard <= -9) {
          byte[] var4 = var3.getBytes(true);
          var3.unlink((byte) -81);
          return var4;
        }
        return (byte[]) null;
    }

    final int groupProgress(int guard, int groupId) {
        if (guard != 0) {
          this.field_q = (IntrusiveNodeHashTable) null;
        }
        ArchiveRequest var3 = (ArchiveRequest) (this.field_q.get((long)groupId, -1));
        if (var3 != null) {
          return var3.progress(100);
        }
        return 0;
    }

    final void b(byte param0) {
        if (null == this.field_x) {
          return;
        }
        int var2 = -123 / ((53 - param0) / 42);
        this.field_j = true;
        if (null == this.field_u) {
          this.field_u = new IntrusiveDeque();
        }
    }

    final static void b(int param0) {
        if (!UiContainer.e((byte) 113)) {
          return;
        }
        if (he.field_u == null) {
          return;
        }
        if (param0 != 2) {
          return;
        }
        if (!he.field_u.ensureIndex(0)) {
          return;
        }
        if (!he.field_u.tryLoadAllGroups((byte) -119)) {
          return;
        }
        if (PcmResampler.field_h == null) {
          PcmResampler.field_h = ci.requestArchiveKey(5, 0, -1, 2);
          return;
        }
        if (PcmResampler.field_h.key == null) {
          return;
        }
        ld.field_h = pn.a(PcmResampler.field_h.key, he.field_u, ld.field_h, UiContainer.field_B, (byte) 112);
        if (se.field_b == null) {
          se.field_b = MarkerSliderPainter.a(1, he.field_u, IndexedSpriteState.field_j, PcmResampler.field_h.key);
        }
        if (null != se.field_b) {
          PcmResampler.field_h = null;
          he.field_u = null;
        }
    }

    final ArchiveIndex getIndex(int guard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = EscapeVector.obfuscationControl;
        if (this.field_m != null) {
          return this.field_m;
        }
        if (null == this.field_y) {
          if (this.field_t.c(20)) {
            return null;
          }
          this.field_y = (ArchiveRequest) ((Object) this.field_t.a(255, true, (byte) 0, this.field_s, (byte) 0));
        }
        if (this.field_y.field_u) {
          return null;
        }
        byte[] var7 = this.field_y.getBytes(true);
        byte[] var6 = var7;
        byte[] var5 = var6;
        byte[] var2 = var5;
        if (guard != 29192) {
          CachedArchiveProvider.a((byte) 93, -10, 70);
        }
        if (this.field_y instanceof DiskCacheRequest) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_m = new ArchiveIndex(var7, this.field_p, this.field_g);
            if (this.field_m.revision != this.field_l) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_m = null;
            if (!this.field_t.c(20)) {
              this.field_y = (ArchiveRequest) ((Object) this.field_t.a(255, true, (byte) 0, this.field_s, (byte) 0));
            } else {
              this.field_y = null;
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_m = new ArchiveIndex(var7, this.field_p, this.field_g);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_t.b((byte) -125);
            this.field_m = null;
            if (!this.field_t.c(20)) {
              this.field_y = (ArchiveRequest) ((Object) this.field_t.a(255, true, (byte) 0, this.field_s, (byte) 0));
            } else {
              this.field_y = null;
            }
            return null;
          }
          if (this.field_o != null) {
            this.field_k.a(var7, this.field_s, guard ^ 29194, this.field_o);
          }
        }
        this.field_y = null;
        if (null != this.field_x) {
          this.field_f = new byte[this.field_m.groupCapacity];
        }
        return this.field_m;
    }

    private final ArchiveRequest a(int param0, int param1, int param2) {
        Throwable decompiledCaughtException = null;
        int var6_int = 0;
        int var9 = 0;
        int var10 = EscapeVector.obfuscationControl;
        ArchiveRequest var12 = (ArchiveRequest) (this.field_q.get((long)param0, -1));
        Object var4 = var12;
        if (var12 != null &&
          param1 == 0 &&
          !var12.field_r &&
          var12.field_u) {
          var12.unlink((byte) -16);
          var4 = null;
        }
        if (var4 == null) {
          if (param1 != 0) {
            if (param1 != 1) {
              if (param1 != 2) {
                throw new RuntimeException();
              }
              if (this.field_x == null) {
                throw new RuntimeException();
              }
              if (this.field_f[param0] != -1) {
                throw new RuntimeException();
              }
              if (this.field_t.b(20)) {
                return null;
              }
              var4 = this.field_t.a(this.field_s, false, (byte) 0, param0, (byte) 2);
            } else {
              if (this.field_x == null) {
                throw new RuntimeException();
              }
              var4 = this.field_k.a((byte) -127, this.field_x, param0);
            }
          } else if (this.field_x != null &&
            -1 != this.field_f[param0]) {
            var4 = this.field_k.a(this.field_x, param2 ^ 23908, param0);
          } else {
            if (this.field_t.c(20)) {
              return null;
            }
            var4 = this.field_t.a(this.field_s, true, (byte) 0, param0, (byte) 2);
          }
          this.field_q.put((IntrusiveNode) (var4), 10901, (long)param0);
        }
        if (((ArchiveRequest) (var4)).field_u) {
          return null;
        }
        if (param2 != 23874) {
          this.getIndex(1);
        }
        byte[] var18 = ((ArchiveRequest) (var4)).getBytes(true);
        byte[] var13 = var18;
        byte[] var5 = var13;
        if (var4 instanceof DiskCacheRequest) {
          try {
            if (var5 != null &&
              2 < var18.length) {
              qf.field_m.reset();
              qf.field_m.update(var5, 0, var18.length - 2);
              var6_int = (int)qf.field_m.getValue();
              if (var6_int != this.field_m.groupCrc32s[param0]) {
                throw new RuntimeException();
              }
              if (this.field_m.groupDigests != null &&
                this.field_m.groupDigests[param0] != null) {
                byte[] var27 = this.field_m.groupDigests[param0];
                byte[] var28 = RasterBuffer.a(var5, 0, var18.length - 2, param2 - 23874);
                for (var9 = 0; var9 < 64; var9++) {
                  if (~var27[var9] != ~var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              int var7 = (var5[-2 + var18.length] << 8 & 65280) + (255 & var5[-1 + var18.length]);
              if (var7 != (this.field_m.groupVersions[param0] & 65535)) {
                throw new RuntimeException();
              }
              if (this.field_f[param0] != 1) {
                if (this.field_f[param0] != 0) {
                }
                this.field_f[param0] = (byte) 1;
              }
              if (!((ArchiveRequest) (var4)).field_r) {
                ((ArchiveRequest) (var4)).unlink((byte) -93);
              }
              Object stackIn_61_0 = var4;
              return (ArchiveRequest) (stackIn_61_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            Exception var6_ref = (Exception) (Object) decompiledCaughtException;
            this.field_f[param0] = (byte)-1;
            ((ArchiveRequest) (var4)).unlink((byte) -92);
            if (((ArchiveRequest) (var4)).field_r &&
              !this.field_t.c(20)) {
              var4 = this.field_t.a(this.field_s, true, (byte) 0, param0, (byte) 2);
              this.field_q.put((IntrusiveNode) (var4), 10901, (long)param0);
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            qf.field_m.reset();
            qf.field_m.update(var5, 0, var18.length - 2);
            var6_int = (int)qf.field_m.getValue();
            if (var6_int != this.field_m.groupCrc32s[param0]) {
              throw new RuntimeException();
            }
            if (this.field_m.groupDigests != null &&
              null != this.field_m.groupDigests[param0]) {
              byte[] var30 = this.field_m.groupDigests[param0];
              byte[] var29 = RasterBuffer.a(var5, 0, -2 + var18.length, 0);
              int var11 = 0;
              var9 = var11;
              while (var11 < 64) {
                if (var29[var11] != var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.field_t.field_g = 0;
            this.field_t.field_d = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_t.b((byte) -110);
          ((ArchiveRequest) (var4)).unlink((byte) -86);
          if (!((ArchiveRequest) (var4)).field_r) {
            return null;
          }
          if (this.field_t.c(param2 - 23854)) {
            return null;
          }
          var4 = this.field_t.a(this.field_s, true, (byte) 0, param0, (byte) 2);
          this.field_q.put((IntrusiveNode) (var4), 10901, (long)param0);
          return null;
        }
        var5[var18.length - 2] = (byte)(this.field_m.groupVersions[param0] >>> 8);
        var5[var18.length - 1] = (byte)this.field_m.groupVersions[param0];
        if (null != this.field_x) {
          this.field_k.a(var18, param0, param2 ^ 23872, this.field_x);
          if (this.field_f[param0] != 1) {
            this.field_f[param0] = (byte) 1;
          }
        }
        if (!((ArchiveRequest) (var4)).field_r) {
          ((ArchiveRequest) (var4)).unlink((byte) -86);
        }
        return (ArchiveRequest) (var4);
    }

    final void d(int param0) {
        int var4 = EscapeVector.obfuscationControl;
        if (null == this.field_u) {
          return;
        }
        if (this.getIndex(29192) == null) {
          return;
        }
        if (param0 != -1) {
          this.getEncodedGroup((byte) -27, -44);
        }
        IntrusiveNode var2 = this.field_e.first(false);
        while (var2 != null) {
          int var3 = (int)var2.key;
          if (var3 < 0) {
            var2.unlink((byte) -57);
          } else if (var3 >= this.field_m.groupCapacity) {
            var2.unlink((byte) -57);
          } else if (this.field_m.groupFileCounts[var3] == 0) {
            var2.unlink((byte) -57);
          } else {
            if (this.field_f[var3] == 0) {
              ArchiveRequest discarded$0 = this.a(var3, 1, param0 ^ -23875);
            }
            if (this.field_f[var3] == -1) {
              ArchiveRequest discarded$1 = this.a(var3, 2, 23874);
            }
            if (this.field_f[var3] == 1) {
              var2.unlink((byte) -118);
            }
          }
          var2 = this.field_e.next((byte) 70);
        }
    }

    final static Sprite a(ResourceArchive param0, boolean param1, int param2, int param3) {
        String stackIn_10_2 = null;
        try {
          if (!param1) {
            CachedArchiveProvider.releaseStatics((byte) 80);
          }
          if (uc.a(param0, 116, param3, param2)) {
            Sprite stackIn_6_0 = je.b(100);
            return stackIn_6_0;
          }
          Object stackIn_4_0 = null;
          return (Sprite) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var4;
          StringBuilder stackIn_9_1 = new StringBuilder().append("hk.H(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        field_r = null;
        if (guard != 8) {
          field_r = (String[]) null;
        }
        field_w = null;
    }

    final static int a(byte param0, int param1, int param2) {
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var3_int = 0;
          int var4 = EmailSyntaxValidator.field_o;
          if (param0 != 122) {
            CachedArchiveProvider.b(91);
          }
          while (Js5NetworkRequest.field_I.length > var3_int) {
            int var5 = jj.field_a[var3_int];
            if (0 <= var5) {
              int var6 = LoginMethod.a(98, Js5NetworkRequest.field_I[var3_int], true);
              var4 = var4 + CheckboxPainter.field_s;
              int var7 = -(var6 >> 1) + ClientException.field_e;
              if (DualLinkNode.a(param1, (en.field_k << 1) + ok.field_a, param0 ^ -123, var4, -fe.field_k + var7, (fe.field_k << 1) + var6, param2)) {
                int stackIn_8_0 = var5;
                return stackIn_8_0;
              }
              var4 = var4 + (CheckboxPainter.field_s + (en.field_k << 1) + ok.field_a);
            } else {
              var4 = var4 + je.field_b;
            }
            var3_int++;
          }
          int stackIn_12_0 = -1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "hk.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    CachedArchiveProvider(int param0, SectorCacheStore param1, SectorCacheStore param2, Js5Transport param3, DiskCacheWorker param4, int param5, byte[] param6, int param7, boolean param8) {
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        String stackIn_19_2 = null;
        String stackIn_22_2 = null;
        String stackIn_25_2 = null;
        this.field_q = new IntrusiveNodeHashTable(16);
        this.field_z = 0;
        this.field_e = new IntrusiveDeque();
        this.field_h = 0L;
        try {
          this.field_s = param0;
          this.field_x = param1;
          if (null == this.field_x) {
            this.field_v = false;
          } else {
            this.field_v = true;
            this.field_u = new IntrusiveDeque();
          }
          this.field_l = param7;
          this.field_o = param2;
          this.field_k = param4;
          this.field_t = param3;
          this.field_g = param6;
          this.field_p = param5;
          boolean stackIn_7_1 = (param8);
          this.field_i = stackIn_7_1;
          if (this.field_o != null) {
            this.field_y = (ArchiveRequest) ((Object) this.field_k.a(this.field_o, 106, this.field_s));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var10;
          StringBuilder stackIn_12_1 = new StringBuilder().append("hk.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          StringBuilder stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          StringBuilder stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          StringBuilder stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_r = new String[]{"Belter Award", "Moon Runner", "Moon Raker", "Hero of Earth", "Star Pilot", "Ace Pilot", "Fuel Filler", "Tough Destroyer", "Speed Nitwit", "Speed Freak", "Speed Demon", "Power Pilot", "Spirit of Vengeance", "Force King", "Seeker Shaker", "Flak Dancer", "Seeker Slingshot", "G Force", "Belter Award (Normal)", "Moon Runner (Normal)", "Moon Raker (Normal)", "Hero of Earth (Normal)", "High Octane", "Ore Crusher", "Cold Fusion", "Saviour of Earth", "Heroic Pilot", "Ultimate Pilot", "Total Annihilation", "Virtual Reality", "Bouncing Around", "Free Fall"};
        ld.a(50, (byte) -6);
    }
}
