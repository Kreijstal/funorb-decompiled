/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WeightedObjectCache {
    private SecondaryNodeDeque recencyQueue;
    static String loginUsernameEmailText;
    private int remainingWeightCapacity;
    private IterableNodeHashTable entriesByKey;
    static String[] ratingModeLongNames;
    static int sportsThemeCompletionAchievementId;
    private int weightCapacity;

    private final void removeByKey(long key, int methodGuard) {
        CacheReference entry = (CacheReference) ((Object) this.entriesByKey.findByKey(key, (byte) -72));
        this.removeEntry(methodGuard - 117, entry);
        if (methodGuard == 0) {
            return;
        }
        loginUsernameEmailText = (String) null;
    }

    private final void putWeighted(long key, int entryWeight, boolean methodGuard, Object value) {
        CacheReference entryToEvict = null;
        StrongCacheReference strongEntry = null;
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
            if (entryWeight > this.weightCapacity) {
                throw new IllegalStateException();
            }
            this.removeByKey(key, 0);
            this.remainingWeightCapacity = this.remainingWeightCapacity - entryWeight;
            while (0 > this.remainingWeightCapacity) {
                entryToEvict = (CacheReference) ((Object) this.recencyQueue.removeFirst((byte) -41));
                this.removeEntry(114, entryToEvict);
            }
            strongEntry = new StrongCacheReference(value, entryWeight);
            this.entriesByKey.put(key, -99, strongEntry);
            if (methodGuard) {
                WeightedObjectCache.clearAvatarSteering(-85);
            }
            this.recencyQueue.addLast(-1, strongEntry);
            ((CacheReference) ((Object) strongEntry)).secondaryKey = 0L;
        } catch (RuntimeException cachePutFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) cachePutFailure), "jj.F(" + key + ',' + entryWeight + ',' + methodGuard + ',' + (value != null ? "{...}" : "null") + ')');
        }
    }

    final Object getByKey(byte methodGuard, long key) {
        CacheReference cachedReference = (CacheReference) ((Object) this.entriesByKey.findByKey(key, (byte) 61));
        if (cachedReference == null) {
            return null;
        }
        Object referent = cachedReference.getReferent((byte) 120);
        if (methodGuard < 56) {
            return (Object) null;
        }
        if (referent == null) {
            cachedReference.unlinkNode(false);
            cachedReference.unlinkSecondaryNode((byte) 92);
            this.remainingWeightCapacity = this.remainingWeightCapacity + cachedReference.entryWeight;
            return null;
        }
        if (!cachedReference.requiresStrongPromotion(13)) {
            this.recencyQueue.addLast(-1, cachedReference);
            cachedReference.secondaryKey = 0L;
            return referent;
        }
        StrongCacheReference promotedReference = new StrongCacheReference(referent, cachedReference.entryWeight);
        this.entriesByKey.put(cachedReference.nodeKey, -81, promotedReference);
        this.recencyQueue.addLast(-1, promotedReference);
        ((CacheReference) ((Object) promotedReference)).secondaryKey = 0L;
        cachedReference.unlinkNode(false);
        cachedReference.unlinkSecondaryNode((byte) 93);
        return referent;
    }

    final void put(int methodGuard, long key, Object value) {
        try {
            int guardResidue = 4 / ((methodGuard - 56) / 59);
            this.putWeighted(key, 1, false, value);
        } catch (RuntimeException cachePutFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) cachePutFailure), "jj.A(" + methodGuard + ',' + key + ',' + (value != null ? "{...}" : "null") + ')');
        }
    }

    final static void clearAvatarSteering(int methodGuard) {
        if (methodGuard > -96) {
            loginUsernameEmailText = (String) null;
            FullscreenSupport.avatarSteeringDirectionId = 0;
            return;
        }
        FullscreenSupport.avatarSteeringDirectionId = 0;
    }

    private final void removeEntry(int methodGuard, CacheReference entry) {
        int guardResidue = 0;
        RuntimeException removalFailureForContext = null;
        RuntimeException removalFailureBeforeContext = null;
        StringBuilder removalMessagePrefix = null;
        String entryDescription = null;
        RuntimeException caughtRemovalFailure = null;
        try {
          guardResidue = -56 % ((61 - methodGuard) / 42);
          if (entry == null) {
            return;
          }
          entry.unlinkNode(false);
          entry.unlinkSecondaryNode((byte) 75);
          this.remainingWeightCapacity = this.remainingWeightCapacity + entry.entryWeight;
          return;
        } catch (java.lang.RuntimeException removalFailure) {
          caughtRemovalFailure = removalFailure;
          removalFailureForContext = caughtRemovalFailure;
          removalFailureBeforeContext = removalFailureForContext;
          removalMessagePrefix = new StringBuilder().append("jj.B(").append(methodGuard).append(',');
          if (entry == null) {
            entryDescription = "null";
          } else {
            entryDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) removalFailureBeforeContext), ((StringBuilder) (Object) removalMessagePrefix).append(entryDescription).append(')').toString());
        }
    }

    public static void releaseCacheTextResources(int methodGuard) {
        ratingModeLongNames = null;
        int guardResidue = -3 / ((81 - methodGuard) / 41);
        loginUsernameEmailText = null;
    }

    private WeightedObjectCache() throws Throwable {
        throw new Error();
    }

    static {
        loginUsernameEmailText = "Login: ";
        ratingModeLongNames = new String[]{"Showing by rating", "Showing by win percentage"};
        sportsThemeCompletionAchievementId = 13;
    }
}
