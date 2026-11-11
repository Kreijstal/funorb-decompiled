/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerInputQueue {
    private IntQueue masks;
    static String field_d;
    static boolean field_c;
    static ToolkitSprite field_a;
    static String field_b;
    private int pendingCount;

    final void push(int param0, int param1) {
        if (param0 != 79) {
          PlayerInputQueue.releaseStatics(-1);
        }
        this.masks.add((byte) -114, param1);
        this.pendingCount = this.pendingCount + 1;
    }

    final boolean hasPending(int param0) {
        if (param0 > -122) {
          return false;
        }
        return this.pendingCount > 0 ? true : false;
    }

    final int getPendingCount(byte param0) {
        if (param0 <= 85) {
          this.masks = (IntQueue) null;
        }
        return this.pendingCount;
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != -9598) {
          field_a = (ToolkitSprite) null;
        }
        field_a = null;
    }

    final static void a(int param0, PlatformTaskDispatcher param1, byte param2, PacketBuffer param3) {
        try {
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          String dupTemp$1 = null;
          RuntimeException stackIn_38_0 = null;
          StringBuilder stackIn_38_1 = null;
          String stackIn_39_2 = null;
          StringBuilder stackIn_41_1 = null;
          String stackIn_42_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var5 = 0;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          String var8 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          String var16 = null;
          int var17 = 0;
          aj var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          byte[][] var21 = null;
          int var13Lifetime1;
          var14 = TombRacer.field_G ? 1 : 0;
          try {
            var18 = new aj();
            var18.field_f = param3.readUnsignedByte(255);
            var18.field_n = param3.readInt(-12);
            var18.field_i = new int[var18.field_f];
            var18.field_k = new AsyncRequest[var18.field_f];
            var18.field_g = new byte[var18.field_f][][];
            var18.field_h = new int[var18.field_f];
            var18.field_j = new AsyncRequest[var18.field_f];
            var18.field_m = new int[var18.field_f];
            var5 = 0;
            if (param2 != 72) {
              field_c = true;
            }
            while (var5 < var18.field_f) {
              try {
                var6_int = param3.readUnsignedByte(255);
                if (0 != var6_int &&
                  var6_int != 1 &&
                  var6_int != 2) {
                  if (var6_int == 3 ||
                    var6_int == 4) {
                    var20 = param3.readString((byte) -76);
                    var8 = param3.readString((byte) -76);
                    var9 = param3.readUnsignedByte(param2 + 183);
                    var10 = new String[var9];
                    for (var11_int = 0; var9 > var11_int; var11_int++) {
                      var10[var11_int] = param3.readString((byte) -76);
                    }
                    var21 = new byte[var9][];
                    var19 = var21;
                    var11 = var19;
                    if (3 == var6_int) {
                      for (var12_int = 0; var12_int < var9; var12_int++) {
                        var13 = param3.readInt(param2 ^ -87);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param3.readBytes(var21[var12_int], 0, -116, var13);
                      }
                    }
                    var18.field_i[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var9 > var17) {
                      var12[var17] = SafeZoneBehaviour.resolveReflectionType(var10[var17], 1);
                      var17++;
                    }
                    var18.field_k[var5] = param1.requestDeclaredMethod(26868, var12, var8, SafeZoneBehaviour.resolveReflectionType(var20, 1));
                    var18.field_g[var5] = var21;
                  }
                } else {
                  var16 = param3.readString((byte) -76);
                  dupTemp$1 = param3.readString((byte) -76);
                  var15 = dupTemp$1;
                  var8 = dupTemp$1;
                  var9 = 0;
                  if (1 == var6_int) {
                    var9 = param3.readInt(param2 + 25);
                  }
                  var18.field_i[var5] = var6_int;
                  var18.field_h[var5] = var9;
                  var18.field_j[var5] = param1.requestDeclaredField(10355, var15, SafeZoneBehaviour.resolveReflectionType(var16, 1));
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_m[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_m[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_m[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_m[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_m[var5] = -5;
              }
              var5++;
            }
            IntNode.field_g.addLast((byte) -109, var18);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_38_0 = var4;
            stackIn_38_1 = new StringBuilder().append("kq.I(").append(param0).append(',');
            if (param1 == null) {
              stackIn_39_2 = "null";
            } else {
              stackIn_39_2 = "{...}";
            }
            stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_42_2 = "null";
            } else {
              stackIn_42_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static RoomDefinition findRoomDefinition(int param0, int param1) {
        int var3 = 0;
        qg var4_ref_qg = null;
        RoomDefinition[] var5 = null;
        int var6 = 0;
        RoomDefinition var7 = null;
        int var8 = TombRacer.field_G ? 1 : 0;
        qg[] var9 = cm.field_a;
        qg[] var2 = var9;
        for (var3 = 0; var3 < var9.length; var3++) {
          var4_ref_qg = var9[var3];
          var5 = var4_ref_qg.field_c;
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (~param1 == ~var7.field_f) {
              return var7;
            }
          }
        }
        int var4 = -65 % ((param0 - 25) / 60);
        return null;
    }

    final static void a(int param0, int param1, byte param2) {
        if (ql.field_k == null) {
          return;
        }
        if (param2 < 106) {
          field_a = (ToolkitSprite) null;
        }
        qpa var3 = new qpa();
        var3.b(param1, -123);
        var3.a(7, param0);
        hw.a((byte) -111, 1, 79, var3);
    }

    final void clear(boolean param0) {
        this.masks.clear(-84);
        if (param0) {
          return;
        }
        this.pendingCount = 0;
    }

    final int pop(byte param0) {
        if (param0 > -35) {
          this.hasPending(-122);
        }
        this.pendingCount = this.pendingCount - 1;
        if (this.masks.isEmpty((byte) -26)) {
          return -1;
        }
        return this.masks.poll(104);
    }

    public PlayerInputQueue() {
        this.masks = new IntQueue();
        this.pendingCount = 0;
    }

    static {
        field_b = "DirectX";
        field_d = "High";
    }
}
